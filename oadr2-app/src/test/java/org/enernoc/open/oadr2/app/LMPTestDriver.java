package org.enernoc.open.oadr2.app;

import org.junit.Assert;

public class LMPTestDriver {

   public static void main(String[] args) {
      LMPGenerator lmp = new LMPGenerator();

      lmp.getCurrentPrice();

      Assert.assertTrue("Error: Value is not in bounds. Exiting",
            lmp.getCurrentPrice() < 100 && lmp.getCurrentPrice() >= 0);

      lmp.nextPrice(0, 50);
      
      Assert.assertTrue("Error: Value is not in bounds. Exiting",
            lmp.getCurrentPrice() < 50 && lmp.getCurrentPrice() >= 0);
      
   }
}
