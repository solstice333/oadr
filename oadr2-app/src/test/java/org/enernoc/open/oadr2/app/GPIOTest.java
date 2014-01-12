package org.enernoc.open.oadr2.app;

import static org.junit.Assert.*;
import junit.framework.Assert;

import java.util.Scanner;

import org.junit.Test;

/*
 * TODO Instructions on testing:
 * 1. Use copyGPIOToRpi.sh 
 * 2. sudo -i
 * 3. use testGPIO.sh 
 */

public class GPIOTest {

   @Test
   public void test() {
      // Test constructors
      GPIO outpin2 = new GPIO(2, Dir.OUT);
      Assert.assertEquals(2, outpin2.getPin());
      Assert.assertTrue(outpin2.getDirection().equals(Dir.OUT));

      GPIO readpin = new GPIO(3, Dir.IN);
      Assert.assertEquals(3, readpin.getPin());
      Assert.assertTrue(readpin.getDirection().equals(Dir.IN));

      GPIO outpin4 = new GPIO(4, Dir.OUT);
      Assert.assertEquals(4, outpin4.getPin());
      Assert.assertTrue(outpin4.getDirection().equals(Dir.OUT));

      GPIO outpin = null;

      // setup up event loop
      Scanner s = new Scanner(System.in);
      String discard = "";
      char input = 0;
      boolean quitOuter = false;
      boolean quitInner = true;

      while (!quitOuter) {
         System.out.println("Choose a pin: 2 or 4? Or switch readpin "
               + "to outpin (s)? Or quit (q)?");
         switch (s.nextLine().charAt(0)) {
         case '2':
            outpin = outpin2;
            quitInner = false;
            break;
         case '4':
            outpin = outpin4;
            quitInner = false;
            break;
         case 's':
            readpin.setDirection(Dir.OUT);
            outpin = readpin;
            quitInner = false;
            break;
         case 'q':
            quitOuter = true;
            break;
         default:
            System.err.println("Error: Not a valid pin.");
         }

         while (!quitInner) {
            System.out.println("Operations for outpin: " + "\n    -on (n)"
                  + "\n    -off (f)" + "\n    -toggle (t)" + "\n    -quit (q)");

            switch (s.nextLine().charAt(0)) {
            case 'n':
               outpin.setOn();
               Assert.assertEquals(State.ON, outpin.getState());

               if (outpin.getPin() == 2 && readpin.getDirection() != Dir.OUT)
                  Assert.assertTrue(readpin.read() == 1);

               break;
            case 'f':
               outpin.setOff();
               Assert.assertEquals(State.OFF, outpin.getState());

               if (outpin.getPin() == 2 && readpin.getDirection() != Dir.OUT)
                  Assert.assertTrue(readpin.read() == 0);

               break;
            case 't':  
               State curr = outpin.getState();
               Assert.assertFalse(outpin.toggleState().equals(curr));
               break;
            case 'q':
               quitInner = true;
               break;
            default:
               System.err.println("Error: Invalid option");
               break;
            }
         }
      }

      // close the connection
      outpin2.close();
      outpin4.close();
      readpin.close();
   }
}
