package org.enernoc.open.oadr2.app;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

enum Dir {
   IN("in"), OUT("out");

   private String str;

   Dir(String s) {
      str = s;
   }

   String value() {
      return str;
   }
}

enum State {
   OFF(0), ON(1);

   private int state;

   State(int s) {
      state = s;
   }

   int value() {
      return state;
   }
}

public class GPIO implements Closeable {
   private int pin;
   private Dir dir;
   private State state;

   private PrintWriter export = null;
   private PrintWriter unexport = null;
   private PrintWriter direction = null;
   private PrintWriter valueOut = null;
   private Scanner valueIn = null;

   private void connectWithWriteValueHandle() {
      try {
         valueOut = new PrintWriter(new FileOutputStream("/sys/class/gpio/gpio"
               + pin + "/value"), true);
      }
      catch (FileNotFoundException fnfe) {
         throw new RuntimeException(
               "Error: Unable to connect to /sys/class/gpio/gpio" + pin
                     + "/value");
      }
   }

   private void connectWithReadValueHandle() {
      try {
         valueIn = new Scanner(new FileInputStream("/sys/class/gpio/gpio" + pin
               + "/value"));
      }
      catch (FileNotFoundException fnfe) {
         throw new RuntimeException(
               "Error: Unable to connect to /sys/class/gpio/gpio" + pin
                     + "/value");
      }
   }

   private void initialize() {
      // establish connections with export and unexport files inside
      // /sys/class/gpio
      try {
         export = new PrintWriter(
               new FileOutputStream("/sys/class/gpio/export"), true);
         unexport = new PrintWriter(new FileOutputStream(
               "/sys/class/gpio/unexport"), true);
      }
      catch (FileNotFoundException fnfe) {
         throw new RuntimeException(
               "Error: Unable to connect to /sys/class/gpio. Try using sudo?");
      }

      // create abstract filepath for gpio pin for checking if exists before
      // writing to export
      File gpioPinPath = new File("/sys/class/gpio/gpio" + pin);

      // if gpio filepath already exists, unexport the gpio pin.
      // Then, export the gpio pin.
      if (gpioPinPath.exists())
         unexport.printf("%d", pin);
      export.printf("%d", pin);

      // establish write connection with the direction file and write to it
      try {
         direction = new PrintWriter(new FileOutputStream(
               "/sys/class/gpio/gpio" + pin + "/direction"), true);
      }
      catch (FileNotFoundException fnfe) {
         throw new RuntimeException(
               "Error: Unable to connect to /sys/class/gpio/gpio" + pin
                     + "/direction");
      }
      direction.printf("%s", dir.value());

      // establish read or write connection with the value file
      if (dir == Dir.OUT)
         connectWithWriteValueHandle();
      else
         connectWithReadValueHandle();
      state = State.OFF;
   }

   public GPIO(int p, Dir d) {
      pin = p;
      dir = d;
      initialize();
   }

   public int getPin() {
      return pin;
   }

   public void setDirection(Dir d) {
      dir = d;
      direction.printf("%s", dir.value());
   }

   public Dir getDirection() {
      return dir;
   }

   public void setOn() {
      if (dir == Dir.OUT) {
         if (valueOut == null)
            connectWithWriteValueHandle();

         valueOut.printf("%d", State.ON.value());
         state = State.ON;
      }
   }

   public void setOff() {
      if (dir == Dir.OUT) {
         if (valueOut == null)
            connectWithWriteValueHandle();

         valueOut.printf("%d", State.OFF.value());
         state = State.OFF;
      }
   }

   public State getState() {
      if (dir == Dir.OUT)
         return state;
      else
         return null;
   }

   public State toggleState() {
      if (dir == Dir.OUT) {
         if (state == State.OFF)
            setOn();
         else
            setOff();

         return state;
      }
      return null;
   }

   public Dir toggleDirection() {
      if (dir == Dir.IN)
         setDirection(Dir.OUT);
      else
         setDirection(Dir.IN);
      
      return dir;
   }

   public int read() {
      if (dir == Dir.IN) {
         connectWithReadValueHandle();
         int readVal = valueIn.nextInt();
         valueIn.close();
         return readVal;
      }
      return -1;
   }

   public void close() {
      unexport.printf("%d", pin);

      export.close();
      unexport.close();
      direction.close();

      if (valueOut != null)
         valueOut.close();
      if (valueIn != null)
         valueIn.close();
   }
}
