package org.enernoc.open.oadr2.xmpp;

import java.util.Scanner;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.packet.Presence;

public class test {

   public static void main(String[] args) throws XMPPException,
         InterruptedException {
      Scanner s = new Scanner(System.in);
      ConnectionConfiguration config = new ConnectionConfiguration(
            "talk.google.com", 5222, "blah");
      XMPPConnection c = new XMPPConnection(config);
      c.connect();
      c.login("knavero@gmail.com", "Hs200oo;");
      System.out.println(c.getUser());
      Roster r = c.getRoster();

      int count = 0;

      System.out.println("buddy count: " + r.getEntryCount() + "\n");

      // display contacts
      while (count == 0) {
         count = 0;
         for (RosterEntry entry : r.getEntries()) {
            if (r.getPresence(entry.getUser()).isAvailable())
               count++;
         }
      }

      String user, reply;
      while (true) {
         for (RosterEntry entry : r.getEntries()) {
            if (r.getPresence(entry.getUser()).isAvailable()) {
               System.out.println("User: " + entry.getUser() + ": "
                     + entry.getName());
               System.out.println("getPresence: "
                     + r.getPresence(entry.getUser()));
               System.out.println("getPresenceResource: "
                     + r.getPresenceResource(entry.getUser()));

               //get presence packet and then use getFrom method to retrieve full JID
               Presence p = r.getPresence(entry.getUser());
               System.out.println("from: " + p.getFrom());

               System.out.println();
            }
         }

         System.out
               .println("Type 'refresh()' to refresh the list (any other string input will quit) ");
         reply = s.next();

         if (!reply.equals("refresh()"))
            break;
      }

   }

}
