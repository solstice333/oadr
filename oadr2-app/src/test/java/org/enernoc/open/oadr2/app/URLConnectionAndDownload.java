package org.enernoc.open.oadr2.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/*
 * Description: This class makes the connection to OASIS and retrieves the
 * Locational Marginal Price (LMP)/hourly electricity prices
 */
public class URLConnectionAndDownload {

   /*
    * Description: This method connects to OASIS and downloads LMP data as a 
    * compressed file
    * Exception: Throws IOException if bad URL
    */
   public static void connectAndDownload() throws IOException {
      // TODO substitute startdate and enddate values with present date.
      // Date or Calendar class maybe?
      
      // instantiate URL connection to OASIS
      URLConnection oasis = new URL(
            "http://oasis.caiso.com/mrtu-oasis/SingleZip?queryname=PRC_LMP&startdate=20130716&enddate=20130716&market_run_id=DAM&node=ANAHEIM_6_N001")
            .openConnection();

      // create input stream using URL connection
      InputStream in = oasis.getInputStream();
      
      // create output stream to lmp.zip
      FileOutputStream out = new FileOutputStream("src/test/resources/lmp.zip");

      byte[] buf = new byte[(int) Math.pow(2, 10)];
      int len;

      // reads in in.read(buf) amount of bytes and sends it to buf
      while ((len = in.read(buf)) > 0) {
         // writes out len amount of bytes from buf with 0 offset and
         // sends it to out
         out.write(buf, 0, len);
      }

      // teardown
      out.close();
      in.close();
   }
}
