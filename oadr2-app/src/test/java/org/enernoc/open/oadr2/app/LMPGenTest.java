package org.enernoc.open.oadr2.app;

import org.junit.Assert;
import org.junit.Test;

public class LMPGenTest {

   @Test
   public void lmpGenTest() {

      // Test constructor
      for (int i = 0; i < 1000; i++) {
         LMPGenerator lmp = new LMPGenerator();
         int currPrice = lmp.getCurrentPrice();

         System.out.println(currPrice);
         Assert.assertTrue("Error: Value is not in bounds. Exiting",
               currPrice < 100 && currPrice >= 0);
      }

      // Test nextPrice()
      LMPGenerator lmp = new LMPGenerator();
      int currPrice;
      
      for (int i = 0; i < 1000; i++) {
         currPrice = lmp.nextPrice(0, 50);
         System.out.println(currPrice);
         Assert.assertTrue("Error: Value is not in bounds. Exiting",
               currPrice < 50 && currPrice >= 0);
      }

   }
}
