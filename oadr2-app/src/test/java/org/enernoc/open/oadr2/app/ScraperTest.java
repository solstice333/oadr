package org.enernoc.open.oadr2.app;

import java.io.IOException;
import org.junit.Test;

/*
 * Description: junit test for testing URLConnectionAndDownload.java and Unzip.java
 */
public class ScraperTest {

   @Test
   public void scraperTest() {
      try {
         URLConnectionAndDownload.connectAndDownload();
         Unzip.unzipFile();
      }
      catch (IOException ioe) {
         ioe.printStackTrace();
      }
   }
}
