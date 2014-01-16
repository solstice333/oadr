package org.enernoc.open.oadr2.app;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

public class UnmarshalLMP {

   @Test
   public void test() throws JAXBException {
      JAXBContext jc = JAXBContext.newInstance("org.enernoc.open.oadr2.app");
      Unmarshaller u = jc.createUnmarshaller();
      
      JAXBElement je = null;
      try {
         je = (JAXBElement) u.unmarshal(new FileInputStream("src/test/resources/lmp.xml"));
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
      }
      
      OASISReport or = (OASISReport) je.getValue();
      MessagePayload mp = or.getMessagePayload();
      RTO rto = mp.getRTO();
      List<REPORTITEM> lmpList = rto.getREPORTITEM();
      
      for (REPORTITEM reportItem : lmpList) {
         System.out.println("\nReport Item: ");
         List<REPORTDATAOASIS> reportDataList = reportItem.getREPORTDATA();
         
         int i = 1;
         REPORTHEADEROASIS reportHeader = reportItem.getREPORTHEADER();
         System.out.println("Market Type: " + reportHeader.getMKTTYPEItem());
         System.out.println("Market Name: " + reportHeader.getCRRMKTNAMEItem());
         System.out.println("Execution Type: " + reportHeader.getEXECUTIONTYPEItem());
         System.out.println("Units of Measurement: " + reportHeader.getUOMItem());
         
         for (REPORTDATAOASIS reportData : reportDataList) {
            System.out.println("Data Item: " + reportData.getDATAITEM() + ", Hour " + i++ + ": " + reportData.getVALUE().getValue());
         }
      }
   }
}
