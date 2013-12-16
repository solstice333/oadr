package org.enernoc.open.oadr2.app;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.ArrayList;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.enernoc.open.oadr2.model.CurrentValue;
import org.enernoc.open.oadr2.model.DateTime;
import org.enernoc.open.oadr2.model.Dtstart;
import org.enernoc.open.oadr2.model.DurationPropType;
import org.enernoc.open.oadr2.model.DurationValue;
import org.enernoc.open.oadr2.model.EiActivePeriod;
import org.enernoc.open.oadr2.model.EiCreatedEvent;
import org.enernoc.open.oadr2.model.EiEvent;
import org.enernoc.open.oadr2.model.EiEventSignal;
import org.enernoc.open.oadr2.model.EiEventSignals;
import org.enernoc.open.oadr2.model.EiResponse;
import org.enernoc.open.oadr2.model.EiTarget;
import org.enernoc.open.oadr2.model.EventDescriptor;
import org.enernoc.open.oadr2.model.EventResponses;
import org.enernoc.open.oadr2.model.EventStatusEnumeratedType;
import org.enernoc.open.oadr2.model.Interval;
import org.enernoc.open.oadr2.model.Intervals;
import org.enernoc.open.oadr2.model.MarketContext;
import org.enernoc.open.oadr2.model.OadrCreatedEvent;
import org.enernoc.open.oadr2.model.OadrDistributeEvent;
import org.enernoc.open.oadr2.model.ObjectFactory;
import org.enernoc.open.oadr2.model.OptTypeType;
import org.enernoc.open.oadr2.model.PayloadFloat;
import org.enernoc.open.oadr2.model.Properties;
import org.enernoc.open.oadr2.model.QualifiedEventID;
import org.enernoc.open.oadr2.model.ResponseCode;
import org.enernoc.open.oadr2.model.ResponseRequiredType;
import org.enernoc.open.oadr2.model.SignalPayload;
import org.enernoc.open.oadr2.model.SignalTypeEnumeratedType;
import org.enernoc.open.oadr2.model.Uid;
import org.enernoc.open.oadr2.model.EventDescriptor.EiMarketContext;
import org.enernoc.open.oadr2.model.OadrDistributeEvent.OadrEvent;
import org.enernoc.open.oadr2.model.Properties.Tolerance;
import org.enernoc.open.oadr2.model.Properties.Tolerance.Tolerate;


//TODO UUID for id's?
//TODO get present time when creating an event
/**
 * Factory class for instantiating an OadrEventDistribution object with a single
 * OadrEvent instance.
 */
public class OadrPayloadFactory {
   // from defaults
   private String requestID = "test-123";
   private String vtnID = "vtn-123";

   // to defaults
   private String eventID = "event-1234";
   private String venID = "ven-1234";
   private String marketContext = "http://enernoc.com";

   public OadrDistributeEvent createEventPayload()
         throws DatatypeConfigurationException {

      OadrDistributeEvent oadrDistrEvent = new OadrDistributeEvent();
      oadrDistrEvent.setRequestID(this.requestID);
      oadrDistrEvent.setVtnID(this.vtnID);

      ArrayList<OadrEvent> oadrEvents = new ArrayList<OadrEvent>();

      // add multiple OadrEvents here
      oadrEvents.add(createOadrEvent(this.eventID, ResponseRequiredType.ALWAYS));
      oadrEvents.add(createOadrEvent("eventNever", ResponseRequiredType.NEVER));
      oadrEvents.add(createOadrEvent("eventAlways1", ResponseRequiredType.ALWAYS));

      oadrDistrEvent.setOadrEvents(oadrEvents);

      return oadrDistrEvent;
   }

   public OadrCreatedEvent createResponsePayload(OadrDistributeEvent ode) {
      /*
       * Status codes for http: See:
       * http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html
       */

      // get list of oadrEvents from oadrDistrubuteEvent payload
      List<OadrEvent> oadrEvents = ode.getOadrEvents();

      // create OadrCreatedEvent with top level fields
      OadrCreatedEvent oce = new OadrCreatedEvent()
            .withEiCreatedEvent(new EiCreatedEvent().withEiResponse(
                  new EiResponse().withRequestID(ode.getRequestID())
                        .withResponseCode(new ResponseCode().withValue("201"))
                        .withResponseDescription("Created"))
                  .withEventResponses(new EventResponses()));

      // create list of EventResponses.EventResponse for oadrCreatedEvent
      // payload in parallel to oadrDistributeEvent payload's OadrEvents list.
      // Lower level fields set.
      ArrayList<EventResponses.EventResponse> responses = new ArrayList<EventResponses.EventResponse>();

      for (int i = 0; i < oadrEvents.size(); i++) {
         switch (oadrEvents.get(i).getOadrResponseRequired()) {
         case ALWAYS:
            responses.add(new EventResponses.EventResponse()
                  .withResponseDescription("Created event! Wooo!")
                  .withRequestID(ode.getRequestID())
                  .withOptType(OptTypeType.OPT_IN)
                  .withResponseCode(new ResponseCode().withValue("201"))
                  .withQualifiedEventID(
                        new QualifiedEventID().withEventID(
                              oadrEvents.get(i).getEiEvent()
                                    .getEventDescriptor().getEventID())
                              .withModificationNumber(
                                    oadrEvents.get(i).getEiEvent()
                                          .getEventDescriptor()
                                          .getModificationNumber())));
            
            break;
         
         case NEVER:
            responses.add(null);
            break;
         
         default:
            System.err
                  .println("Error: bad ResponseRequiredType value not specified by enum");
            System.exit(1);
         }
      }

      oce.getEiCreatedEvent().getEventResponses()
            .setEventResponses(responses);

      return oce;
   }

   private OadrEvent createOadrEvent(String eventID, ResponseRequiredType type) throws DatatypeConfigurationException {
      // instantiate OadrEvent
      OadrEvent oadrEvent = new OadrEvent();
      oadrEvent.setOadrResponseRequired(ResponseRequiredType.ALWAYS);

      // timestamp
      DatatypeFactory xmlDatatypeFactory = DatatypeFactory.newInstance();
      final GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance(
            TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
      cal.set(2013, Calendar.MAY, 31, 17, 35, 55);
      final XMLGregorianCalendar startDateTime = xmlDatatypeFactory
            .newXMLGregorianCalendar(cal);

      // factory to instantiate SignalPayload object
      final ObjectFactory signalPayloadFactory = new ObjectFactory();

      // Specify OadrEvent.
      // OadrEvent encapsulates EiEvent and OadrResponseRequired. EiEvent
      // encapsulates EiTarget,
      // EventDescriptor, EiActivePeriod, and EiEventSignals.
      return oadrEvent
            .withOadrResponseRequired(type)
            .withEiEvent(new EiEvent()
                  .withEiTarget(new EiTarget().withVenIDs(this.venID))
                  .withEventDescriptor(
                        new EventDescriptor()
                              .withEventID(eventID)
                              .withModificationNumber(0)
                              .withEventStatus(EventStatusEnumeratedType.FAR)
                              .withPriority(1L)
                              .withEiMarketContext(
                                    new EiMarketContext(new MarketContext(
                                          this.marketContext)))
                              .withCreatedDateTime(new DateTime(startDateTime)))
                  .withEiActivePeriod(
                        new EiActivePeriod().withProperties(new Properties()
                              .withDtstart(
                                    new Dtstart(new DateTime(startDateTime)))
                              .withDuration(
                                    new DurationPropType(new DurationValue(
                                          "PT1M")))
                              .withTolerance(
                                    new Tolerance(new Tolerate(
                                          new DurationValue("LDK0"))))
                              .withXEiNotification(
                                    new DurationPropType(new DurationValue(
                                          "PT5S")))))
                  .withEiEventSignals(
                        new EiEventSignals()
                              .withEiEventSignals(new EiEventSignal()
                                    .withSignalID(
                                          "signalID goes here")
                                    .withCurrentValue(
                                          new CurrentValue(new PayloadFloat(
                                                1.0f)))
                                    .withSignalName("simple")
                                    // "simple" describes a signal payload of
                                    // 0=normal,
                                    // 1=moderate, 2=high, 3=special
                                    .withSignalType(
                                          SignalTypeEnumeratedType.LEVEL)
                                    .withIntervals(
                                          new Intervals()
                                                .withIntervals(new Interval()
                                                      .withStreamPayloadBase(
                                                            signalPayloadFactory
                                                                  .createSignalPayload(new SignalPayload(
                                                                        new PayloadFloat(
                                                                              1.0f))))
                                                      .withDuration(
                                                            new DurationPropType(
                                                                  new DurationValue(
                                                                        "PT1M")))
                                                      .withUid(
                                                            new Uid(
                                                                  "interval unique identifier")))))));
   }
   
   public void setRequestID(String requestID) {
      this.requestID = requestID;
   }

   public String getRequestID() {
      return this.requestID;
   }

   public void setVtnID(String vtnID) {
      this.vtnID = vtnID;
   }

   public String getVtnID() {
      return this.vtnID;
   }

   public void setEventID(String eventID) {
      this.eventID = eventID;
   }

   public String getEventID() {
      return this.eventID;
   }

   public void setVenID(String venID) {
      this.venID = venID;
   }

   public String getVenID() {
      return this.venID;
   }

   public void setMarketContext(String marketContext) {
      this.marketContext = marketContext;
   }

   public String getMarketContext() {
      return this.marketContext;
   }

}
