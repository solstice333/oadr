package org.enernoc.open.oadr2.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unzip {

   public static void unzipFile() throws IOException {
      ArrayList<String> fileList;

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
      try {
         zis = new ZipInputStream(new FileInputStream(INPUT_PATH));
         ze = zis.getNextEntry();
      }
      catch (FileNotFoundException fnfe) {
         fnfe.printStackTrace();
      }

      // extract files
      while (ze != null) {
         File unzippedFile = new File(OUTPUT_DIR + ze.getName());
         System.out.println("File unzipped: " + unzippedFile.getAbsolutePath());

         unzippedFile.getParentFile().mkdirs();

         FileOutputStream fos = new FileOutputStream(unzippedFile);

         int len;
         while ((len = zis.read(buf)) > 0) {
            fos.write(buf, 0, len);
         }

         System.out.println("File rename: "
               + unzippedFile.renameTo(new File(OUTPUT_DIR + "lmp.xml")));

         fos.close();
         ze = zis.getNextEntry();
      }

      zis.closeEntry();
      zis.close();

      System.out.println("Cleaning...");

      File deleteZip = new File(INPUT_PATH);
      deleteZip.delete();

      System.out.println("Done!");
   }

}
