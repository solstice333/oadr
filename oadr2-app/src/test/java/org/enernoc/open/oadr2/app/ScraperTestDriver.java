package org.enernoc.open.oadr2.app;

import java.io.IOException;

public class ScraperTestDriver {

   public static void main(String[] args) {
      try {
         URLConnectionAndDownload.connectAndDownload();
         Unzip.unzipFile();
      }
      catch (IOException ioe) {
         ioe.printStackTrace();
      }
   }
}
