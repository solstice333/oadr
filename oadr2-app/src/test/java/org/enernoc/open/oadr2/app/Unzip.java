package org.enernoc.open.oadr2.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
 * Description: This class manages the extraction of zip files
 */
public class Unzip {

   /*
    * Description: This method manages the extraction of lmp.zip into lmp.xml
    * Exception: Throws IOException if bad zip input stream
    */
   public static void unzipFile() throws IOException {
      final String INPUT_PATH = "src/test/resources/lmp.zip";
      final String OUTPUT_DIR = "src/test/resources/";

      byte[] buf = new byte[(int) Math.pow(2, 10)];
      ZipInputStream zis = null;
      ZipEntry ze = null;

      // create output directory if it doesn't exist already
      File folder = new File(OUTPUT_DIR);
      if (!folder.exists()) {
         folder.mkdir();
      }

      // instantiate ZipInputStream and ZipEntry
      zis = new ZipInputStream(new FileInputStream(INPUT_PATH));
      ze = zis.getNextEntry();

      // extract files
      while (ze != null) {
         // create file connection to first zip entry
         File unzippedFile = new File(OUTPUT_DIR + ze.getName());

         // create parent directories if existent
         unzippedFile.getParentFile().mkdirs();

         // make the zip entry file connection an output stream
         FileOutputStream fos = new FileOutputStream(unzippedFile);

         // write bytes to file output stream
         int len;
         while ((len = zis.read(buf)) > 0) {
            fos.write(buf, 0, len);
         }
         
         // file is extracted at this point
         System.out.println("File unzipped: " + unzippedFile.getAbsolutePath());

         // rename the file here
         System.out.println("File rename: "
               + unzippedFile.renameTo(new File(OUTPUT_DIR + "lmp.xml")));

         // close output stream and move to the next entry if existent
         fos.close();
         ze = zis.getNextEntry();
      }

      // teardown - close the input stream and delete the zip that is no longer
      // needed
      zis.closeEntry();
      zis.close();

      System.out.println("Cleaning...");

      File deleteZip = new File(INPUT_PATH);
      deleteZip.delete();

      System.out.println("Done!");
   }

}
