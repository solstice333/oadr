package org.enernoc.open.oadr2.app;

import java.util.Collection;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;

import org.enernoc.open.oadr2.model.OadrCreatedEvent;
import org.enernoc.open.oadr2.model.OadrDistributeEvent;
import org.enernoc.open.oadr2.xmpp.JAXBManager;
import org.enernoc.open.oadr2.xmpp.OADR2IQ;
import org.enernoc.open.oadr2.xmpp.OADR2PacketExtension;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Packet;

/**
 * Convenience class for interfacing with Smack API and testing marshall output
 */
public class ConnHandler implements PacketListener {
   private XMPPConnection vtnConnection;
   private XMPPConnection venConnection;
   private OadrDistributeEvent ode;
   private String fullJid, bareJid;

   public void setVenConnection(XMPPConnection ven) {
      this.venConnection = ven;
   }

   public XMPPConnection getVenConnection() {
      return this.venConnection;
   }

   public void setVtnConnection(XMPPConnection connection) {
      this.vtnConnection = connection;
   }

   public XMPPConnection getVtnConnection() {
      return this.vtnConnection;
   }

   public void setOadrDistributeEvent(OadrDistributeEvent o) {
      this.ode = o;
   }

   public OadrDistributeEvent getOadrDistributeEvent() {
      return this.ode;
   }

   public void setFullJid(String fullJid) {
      this.fullJid = fullJid;
   }

   public String getFullJid() {
      return this.fullJid;
   }

   public void setBareJid(String bareJid) {
      this.bareJid = bareJid;
   }

   public String getBareJid() {
      return this.bareJid;
   }

   public XMPPConnection connect(String username, String passwd,
         String xmppServer, String resource) throws XMPPException {
      ConnectionConfiguration connConfig = new ConnectionConfiguration(
            xmppServer, 5222, resource);
      XMPPConnection c = new XMPPConnection(connConfig);
      c.connect();
      c.login(username, passwd, resource);

      if (resource.equals("ven"))
         this.venConnection = c;
      else if (resource.equals("vtn"))
         this.vtnConnection = c;

      return c;
   }

   public void disconnect() {
      if (this.vtnConnection != null && this.vtnConnection.isConnected())
         this.vtnConnection.disconnect();

      if (this.venConnection != null && this.venConnection.isConnected())
         this.venConnection.disconnect();
   }

   public static void testNamespace(Object object) throws JAXBException {
      if (object == null)
         System.out.println("payload object is null");
      else {
         // create marshaller for jaxb context
         JAXBManager jaxbManager = new JAXBManager();
         Marshaller m = jaxbManager.createMarshaller();
         m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

         System.out.println();
         m.marshal(object, System.out);
         System.out.println();
      }
   }

   @Override
   public void processPacket(Packet arg0) {
      // TODO implement this with packetListener. Currently using
      // packetCollector.
   }

   public void displayVenRoster() throws InterruptedException {
      Roster roster = this.venConnection.getRoster();
      Collection<RosterEntry> buddies = roster.getEntries();
      int count = countBuddies(this.venConnection);

      if (count == 0) {
         Thread.sleep(1000);
         displayVenRoster();
      }

      else {
         System.out.println(count + " buddies:");
         for (RosterEntry entry : buddies) {
            if (roster.getPresence(entry.getUser()).isAvailable()) {
               System.out.println("User: " + entry.getUser() + "\nName: "
                     + entry.getName() + "\nPresence: "
                     + roster.getPresence(entry.getUser()));
               System.out.println();
            }
         }
      }
   }

   public void displayVtnRoster() throws InterruptedException {
      Roster roster = this.vtnConnection.getRoster();
      Collection<RosterEntry> buddies = roster.getEntries();
      int count = countBuddies(this.vtnConnection);

      if (count == 0) {
         Thread.sleep(1000);
         displayVtnRoster();
      }

      else {
         System.out.println(count + " buddies:");
         for (RosterEntry entry : buddies) {
            if (roster.getPresence(entry.getUser()).isAvailable()) {
               System.out.println("User: "
                     + roster.getPresence(entry.getUser()).getFrom()
                     + "\nName: " + entry.getName() + "\nPresence: "
                     + roster.getPresence(entry.getUser()));
               System.out.println();
            }
         }
      }
   }

   private int countBuddies(XMPPConnection conn) {
      int count = 0;
      Roster roster = conn.getRoster();
      Collection<RosterEntry> buddies = roster.getEntries();

      for (RosterEntry entry : buddies) {
         if (roster.getPresence(entry.getUser()).isAvailable())
            count++;
      }

      return count;
   }

   public boolean checkIfExists(String user, Roster roster) {
      boolean check = false;

      for (RosterEntry entry : roster.getEntries()) {
         String from = roster.getPresence(entry.getUser()).getFrom();

         if (user.equals(from)) {
            check = true;
            this.bareJid = entry.getUser();
            this.fullJid = from;
         }
      }

      return check;
   }

   public IQ createIQ(String sendTo, Object payload)
         throws DatatypeConfigurationException, JAXBException {

      IQ oadrIQ = null;

      if (payload instanceof OadrDistributeEvent) {
         OadrDistributeEvent ode = (OadrDistributeEvent) payload;
         oadrIQ = new OADR2IQ(new OADR2PacketExtension(ode,
               new JAXBManager().createMarshaller()));
         oadrIQ.setType(IQ.Type.SET);
         oadrIQ.setTo(sendTo);
      }

      else if (payload instanceof OadrCreatedEvent) {
         OadrCreatedEvent oce = (OadrCreatedEvent) payload;
         oadrIQ = new OADR2IQ(new OADR2PacketExtension(oce,
               new JAXBManager().createMarshaller()));
         oadrIQ.setType(IQ.Type.SET);
         oadrIQ.setTo(sendTo);
      }

      else
         System.err
               .println("Error: Not a valid instance of OadrDistributeEvent or OadrCreatedEvent");

      return oadrIQ;
   }

}
