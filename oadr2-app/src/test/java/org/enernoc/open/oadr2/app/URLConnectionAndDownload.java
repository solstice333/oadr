package org.enernoc.open.oadr2.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionAndDownload {
   
   public static void connectAndDownload() throws IOException {
      //TODO substitute startdate and enddate values with present date. Date/Calendar class maybe?
      URLConnection oasis = new URL(
            "http://oasis.caiso.com/mrtu-oasis/SingleZip?queryname=PRC_LMP&startdate=20130716&enddate=20130716&market_run_id=DAM&node=ANAHEIM_6_N001")
            .openConnection();

      InputStream in = oasis.getInputStream();
      try {
         OutputStream out = new FileOutputStream("src/test/resources/lmp.zip");
         
         try {
            byte[] buf = new byte[(int) Math.pow(2, 10)];
            int len;

            // reads in in.read(buf) amount of bytes and sends it to buf
            while ((len = in.read(buf)) > 0) {
               // writes out len amount of bytes from buf with 0 offset and
               // sends it to out
               out.write(buf, 0, len);
            }
         }
         finally {
            out.close();
         }
      }
      finally {
         in.close();
      }
   }
}
