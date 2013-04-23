package org.enernoc.open.oadr2.xmpp;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.packet.Packet;

public class OadrPacketCollector implements PacketListener {
   BlockingQueue<Packet> packets = new ArrayBlockingQueue<Packet>(10);

   @Override
   public void processPacket(Packet packet) {
      // Assuming there is an OADRPacketFilter, only packets with an
      // OadrDistributeEventPacket extension will be passed here.
      this.packets.offer(packet);
   }

   BlockingQueue<Packet> getQueue() {
      return this.packets;
   }
}
