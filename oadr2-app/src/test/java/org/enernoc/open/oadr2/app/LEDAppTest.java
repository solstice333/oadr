package org.enernoc.open.oadr2.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.Test;

// TODO turn this into an API and integrate into OadrApp.java
/*
 * Description: Raspberry Pi GPIO test app
 */
public class LEDAppTest {

   public static final String GPIO_OUT = "out";
   public static final int gpioPin = 2;

   // enums for led states - on and off
   public static enum State {
      OFF(0), ON(1);

      private final int value;

      State(int value) {
         this.value = value;
      }

      public int getValue() {
         return this.value;
      };
   }

   @Test
   public void ledTest() {
      // export and unexport file output stream connections
      // and abstract filepath to test for existence
      PrintWriter export = null;
      PrintWriter unexport = null;

      try {
         export = new PrintWriter(
               new FileOutputStream("/sys/class/gpio/export"), true);
         unexport = new PrintWriter(new FileOutputStream(
               "/sys/class/gpio/unexport"), true);
      }
      catch (FileNotFoundException fnfe) {
         System.err.println("Error: Permission denied. Use sudo");
         System.exit(1);
      }

      File gpioPinDir = new File("/sys/class/gpio/gpio" + gpioPin);

      // setup up event loop
      Scanner s = new Scanner(System.in);
      String discard = "";
      char input = 0;
      boolean quit = false;

      System.out.println("Operations: " + "\n    -initialize gpio pin 2 (i)"
            + "\n    -on (n)" + "\n    -off (f)"
            + "\n    -clean gpio pin 2 (c)" + "\n    -quit (q)");

      while (!quit) {
         System.out.println("Enter a menu choice: ");
         input = s.nextLine().charAt(0);

         switch (input) {
         case 'i':
            // check if gpio pin has already been initialized.
            // If already initialized then unexport
            if (gpioPinDir.exists())
               unexport.printf("%d", gpioPin);

            // export gpio pin
            export.printf("%d", gpioPin);

            // set direction to out
            PrintWriter direction = null;
            try {
               direction = new PrintWriter(new FileOutputStream(
                     "/sys/class/gpio/gpio" + gpioPin + "/direction"), true);
            }
            catch (FileNotFoundException fnfe) {
               fnfe.printStackTrace();
            }

            direction.printf("%s", GPIO_OUT);
            direction.close();

            break;
         case 'n':
            PrintWriter on = null;

            // check for initialization
            try {
               on = new PrintWriter(new FileOutputStream("/sys/class/gpio/gpio"
                     + gpioPin + "/value"), true);
            }
            catch (FileNotFoundException fnfe) {
               System.err.println("Error: GPIO2 has not been initialized");
               break;
            }

            // turn that LED on!
            on.printf("%d", State.ON.getValue());
            on.close();

            break;
         case 'f':
            PrintWriter off = null;

            // check for initialization
            try {
               off = new PrintWriter(new FileOutputStream(
                     "/sys/class/gpio/gpio" + gpioPin + "/value"), true);
            }
            catch (FileNotFoundException fnfe) {
               System.err.println("Error: GPIO2 has not been initialized");
               break;
            }

            // turn that LED off!
            off.printf("%d", State.OFF.getValue());
            off.close();

            break;
         case 'c':
            // clean up the gpio2 directory by unexporting it
            if (gpioPinDir.exists())
               unexport.printf("%d", gpioPin);

            break;
         case 'q':
            quit = true;
            break;
         default:
            System.err.println("Error: invalid option");
            break;
         }
      }

      System.out.println("Quitting...");

   }
}
