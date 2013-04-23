package org.enernoc.open.oadr2.xmpp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import javax.xml.bind.Marshaller;

import org.enernoc.open.oadr2.model.OadrCreatedEvent;
import org.enernoc.open.oadr2.model.OadrDistributeEvent;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.PacketCollector;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smack.packet.Presence;

public class PacketExtensionTestApp {
   static Scanner s = new Scanner(System.in);
   static final String OADR2_XMLNS = "http://openadr.org/oadr-2.0a/2012/07";

   static String username = "openadrvtntest@gmail.com";
   static String passwd = "openadrtest";

   static XMPPConnection vtnConnection;
   static XMPPConnection venConnection;
   static Marshaller marshaller;

   public static void main(String[] args) throws Exception {
      // setup
      setUp();

      //Create PacketCollector queue to retrieve packets sent by vtn
      //PacketCollector packetCollector = venConnection
       //.createPacketCollector(new OADR2PacketFilter());

      PacketListener oadrListener = new PacketListener() {
         @Override
         public void processPacket(Packet packet) {
            // TODO: when a packet gets received by ven
            // parse the packet extension for oadrResponseRequired element
            // if oadrResponseRequired is ALWAYS then send oadrCreatedEvent

            // grab packet extension and typecast payload to OadrDistributeEvent
            // object
            OADR2PacketExtension oadrExtension = (OADR2PacketExtension) packet
                  .getExtension(OADR2_XMLNS);
            OadrDistributeEvent ode = (OadrDistributeEvent) oadrExtension
                  .getPayload();

            // parsing oadrDistributeEvent payload for relevant elements and
            // instantiating OadrCreatedEvent payload via factory method
            System.out.println("parsing oadrDistributeEvent payload...");
            OadrCreatedEvent oce = new OadrPayloadFactory()
                  .createResponsePayload(ode);

            // print xml of OadrCreatedEvent payload
            try {
               System.out.println("createdEventPayload: ");
               ConnHandler.testNamespace(oce);
               OADR2PacketExtension pe = new OADR2PacketExtension(oce,
                     new JAXBManager());
               System.out.println("xmlns: " + pe.getNamespace());
            }
            catch (Exception e) {
               e.printStackTrace();
            }
            finally {
               System.out.println();
            }

            //creates IQ packet for oadrCreatedEvent and sends to vtn
            System.out.println("sending oadrCreatedEvent payload...");
            try {
               IQ oceiq = new ConnHandler().createIQ(packet.getFrom(), oce);
               venConnection.sendPacket(oceiq);
            }
            catch (Exception e) {
               e.printStackTrace();
            }

            System.out.println("oadrCreatedEvent payload sent!");
         }
      };
      venConnection.addPacketListener(oadrListener, new OADR2PacketFilter());

      // print xml of oadrDistributeEvent payload
      System.out.println("oadrDistributeEvent payload: ");
      ConnHandler.testNamespace(new OadrPayloadFactory().createEventPayload());

      // Instantiate IQ packet with oadrDistributeEvent packet extension
      OadrDistributeEvent ode = new OadrPayloadFactory().createEventPayload();
      IQ odeiq = new ConnHandler().createIQ(venConnection.getUser(), ode);
      vtnConnection.sendPacket(odeiq);

      //pollTest(packetCollector);

      Thread.sleep(5000L);
      tearDown();
      System.out.println("Tests passed. Exiting now...");
      System.exit(0);
   }

   private static void setUp() throws Exception {
      XMPPConnection.DEBUG_ENABLED = true;

      if (username == null || passwd == null)
         throw new Exception(
               "XMPP Username or password are null! Set the system properties 'xmpp-username' and 'xmpp-pass'");

      JAXBManager jaxb = new JAXBManager();
      marshaller = jaxb.createMarshaller();

      try {
         vtnConnection = connect("vtn");
      }
      catch (XMPPException xe) {
         System.err
               .println("Login error. See junit stack trace for more details");
      }

      username = "openadrventest@gmail.com";
      passwd = "openadrtest";
      try {
         venConnection = connect("ven");
      }
      catch (XMPPException xe) {
         System.err
               .println("Login error. See junit stack trace for more details.");
      }
   }

   private static XMPPConnection connect(String resource) throws XMPPException {
      XMPPConnection.DEBUG_ENABLED = true;

      ConnectionConfiguration connConfig = new ConnectionConfiguration(
            "talk.google.com", 5222, "gmail.com");
      XMPPConnection c = new XMPPConnection(connConfig);

      c.connect();
      c.login(username, passwd, resource);
      Presence presence = new Presence(Presence.Type.available);
      c.sendPacket(presence);

      return c;
   }

   private static void tearDown() throws Exception {
      while (true) {
         System.out.println("Do you want to quit? Type 'quit()'.");
         String reply = s.next();
         if (reply.equals("quit()"))
            break;
         else {
         }
      }

      if (venConnection != null && venConnection.isConnected())
         venConnection.disconnect();
      if (vtnConnection != null && vtnConnection.isConnected())
         vtnConnection.disconnect();
   }

   private static void tests(Packet packet) {
      assertNotNull(packet);
      OADR2PacketExtension extension = (OADR2PacketExtension) packet
            .getExtension(OADR2_XMLNS);
      assertEquals("oadrDistributeEvent", extension.getElementName());
      assertEquals(OADR2_XMLNS, extension.getNamespace());
      Object pObj = extension.getPayload();
      assertNotNull(pObj);
      assertTrue(pObj instanceof OadrDistributeEvent);
      OadrDistributeEvent payload = (OadrDistributeEvent) pObj;
      assertEquals("test-123", payload.getRequestID());
   }

   private static void pollTest(PacketCollector packetCollector) {
      Packet packet = packetCollector.nextResult(5000L);

      // tests
      tests(packet);
   }

}
