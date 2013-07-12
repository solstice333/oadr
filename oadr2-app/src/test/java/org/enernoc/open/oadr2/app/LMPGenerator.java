package org.enernoc.open.oadr2.app;

import java.util.Random;

public class LMPGenerator {
   private int currentPrice;
   
   private int randRange(int low, int high) {
      Random rand = new Random();
      return rand.nextInt(high - low) + low;
   }

   public LMPGenerator() {
      currentPrice = nextPrice(0, 100);
   }
   
   public LMPGenerator(int max) {
      currentPrice = nextPrice(0, max);
   }
   
   public LMPGenerator(int min, int max) {
      currentPrice = nextPrice(min, max);
   }
   
   public int nextPrice(int min, int max) {
      currentPrice = randRange(min, max);
      return currentPrice;
   }
   
   public int getCurrentPrice() {
      return currentPrice;
   }
}
