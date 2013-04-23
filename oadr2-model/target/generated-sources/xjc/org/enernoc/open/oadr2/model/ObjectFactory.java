//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.23 at 04:06:37 PM PDT 
//


package org.enernoc.open.oadr2.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.enernoc.open.oadr2.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseDescription_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "responseDescription");
    private final static QName _ResponseCode_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "responseCode");
    private final static QName _StreamPayloadBase_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0:stream", "streamPayloadBase");
    private final static QName _SignalPayload_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "signalPayload");
    private final static QName _EventFilter_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110/payloads", "eventFilter");
    private final static QName _EventStatus_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eventStatus");
    private final static QName _XEiRampUp_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "x-eiRampUp");
    private final static QName _ResourceID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "resourceID");
    private final static QName _DateTime_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "date-time");
    private final static QName _ModificationNumber_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "modificationNumber");
    private final static QName _OptType_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "optType");
    private final static QName _EventID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eventID");
    private final static QName _VenID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "venID");
    private final static QName _Components_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "components");
    private final static QName _SignalType_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "signalType");
    private final static QName _MarketContext_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06", "marketContext");
    private final static QName _RequestID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110/payloads", "requestID");
    private final static QName _XEiRecovery_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "x-eiRecovery");
    private final static QName _Duration_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "duration");
    private final static QName _XEiNotification_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "x-eiNotification");
    private final static QName _PartyID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "partyID");
    private final static QName _Text_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "text");
    private final static QName _ReplyLimit_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110/payloads", "replyLimit");
    private final static QName _VtnID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "vtnID");
    private final static QName _GroupID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "groupID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.enernoc.open.oadr2.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OadrDistributeEvent }
     * 
     */
    public OadrDistributeEvent createOadrDistributeEvent() {
        return new OadrDistributeEvent();
    }

    /**
     * Create an instance of {@link EventResponses }
     * 
     */
    public EventResponses createEventResponses() {
        return new EventResponses();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link EventDescriptor }
     * 
     */
    public EventDescriptor createEventDescriptor() {
        return new EventDescriptor();
    }

    /**
     * Create an instance of {@link Properties.Tolerance }
     * 
     */
    public Properties.Tolerance createPropertiesTolerance() {
        return new Properties.Tolerance();
    }

    /**
     * Create an instance of {@link EiResponse }
     * 
     */
    public EiResponse createEiResponse() {
        return new EiResponse();
    }

    /**
     * Create an instance of {@link ResponseCode }
     * 
     */
    public ResponseCode createResponseCode() {
        return new ResponseCode();
    }

    /**
     * Create an instance of {@link OadrDistributeEvent.OadrEvent }
     * 
     */
    public OadrDistributeEvent.OadrEvent createOadrDistributeEventOadrEvent() {
        return new OadrDistributeEvent.OadrEvent();
    }

    /**
     * Create an instance of {@link OadrResponse }
     * 
     */
    public OadrResponse createOadrResponse() {
        return new OadrResponse();
    }

    /**
     * Create an instance of {@link OadrRequestEvent }
     * 
     */
    public OadrRequestEvent createOadrRequestEvent() {
        return new OadrRequestEvent();
    }

    /**
     * Create an instance of {@link EiRequestEvent }
     * 
     */
    public EiRequestEvent createEiRequestEvent() {
        return new EiRequestEvent();
    }

    /**
     * Create an instance of {@link OadrCreatedEvent }
     * 
     */
    public OadrCreatedEvent createOadrCreatedEvent() {
        return new OadrCreatedEvent();
    }

    /**
     * Create an instance of {@link EiCreatedEvent }
     * 
     */
    public EiCreatedEvent createEiCreatedEvent() {
        return new EiCreatedEvent();
    }

    /**
     * Create an instance of {@link EventResponses.EventResponse }
     * 
     */
    public EventResponses.EventResponse createEventResponsesEventResponse() {
        return new EventResponses.EventResponse();
    }

    /**
     * Create an instance of {@link DurationPropType }
     * 
     */
    public DurationPropType createDurationPropType() {
        return new DurationPropType();
    }

    /**
     * Create an instance of {@link Interval }
     * 
     */
    public Interval createInterval() {
        return new Interval();
    }

    /**
     * Create an instance of {@link Uid }
     * 
     */
    public Uid createUid() {
        return new Uid();
    }

    /**
     * Create an instance of {@link EiActivePeriod }
     * 
     */
    public EiActivePeriod createEiActivePeriod() {
        return new EiActivePeriod();
    }

    /**
     * Create an instance of {@link Dtstart }
     * 
     */
    public Dtstart createDtstart() {
        return new Dtstart();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link QualifiedEventID }
     * 
     */
    public QualifiedEventID createQualifiedEventID() {
        return new QualifiedEventID();
    }

    /**
     * Create an instance of {@link EiEvent }
     * 
     */
    public EiEvent createEiEvent() {
        return new EiEvent();
    }

    /**
     * Create an instance of {@link EventDescriptor.EiMarketContext }
     * 
     */
    public EventDescriptor.EiMarketContext createEventDescriptorEiMarketContext() {
        return new EventDescriptor.EiMarketContext();
    }

    /**
     * Create an instance of {@link EiEventSignals }
     * 
     */
    public EiEventSignals createEiEventSignals() {
        return new EiEventSignals();
    }

    /**
     * Create an instance of {@link EiEventSignal }
     * 
     */
    public EiEventSignal createEiEventSignal() {
        return new EiEventSignal();
    }

    /**
     * Create an instance of {@link Intervals }
     * 
     */
    public Intervals createIntervals() {
        return new Intervals();
    }

    /**
     * Create an instance of {@link CurrentValue }
     * 
     */
    public CurrentValue createCurrentValue() {
        return new CurrentValue();
    }

    /**
     * Create an instance of {@link PayloadFloat }
     * 
     */
    public PayloadFloat createPayloadFloat() {
        return new PayloadFloat();
    }

    /**
     * Create an instance of {@link EiTarget }
     * 
     */
    public EiTarget createEiTarget() {
        return new EiTarget();
    }

    /**
     * Create an instance of {@link SignalPayload }
     * 
     */
    public SignalPayload createSignalPayload() {
        return new SignalPayload();
    }

    /**
     * Create an instance of {@link DurationValue }
     * 
     */
    public DurationValue createDurationValue() {
        return new DurationValue();
    }

    /**
     * Create an instance of {@link MarketContext }
     * 
     */
    public MarketContext createMarketContext() {
        return new MarketContext();
    }

    /**
     * Create an instance of {@link Properties.Tolerance.Tolerate }
     * 
     */
    public Properties.Tolerance.Tolerate createPropertiesToleranceTolerate() {
        return new Properties.Tolerance.Tolerate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "responseDescription")
    public JAXBElement<String> createResponseDescription(String value) {
        return new JAXBElement<String>(_ResponseDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "responseCode")
    public JAXBElement<ResponseCode> createResponseCode(ResponseCode value) {
        return new JAXBElement<ResponseCode>(_ResponseCode_QNAME, ResponseCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreamPayloadBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", name = "streamPayloadBase")
    public JAXBElement<StreamPayloadBase> createStreamPayloadBase(StreamPayloadBase value) {
        return new JAXBElement<StreamPayloadBase>(_StreamPayloadBase_QNAME, StreamPayloadBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignalPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "signalPayload", substitutionHeadNamespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", substitutionHeadName = "streamPayloadBase")
    public JAXBElement<SignalPayload> createSignalPayload(SignalPayload value) {
        return new JAXBElement<SignalPayload>(_SignalPayload_QNAME, SignalPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", name = "eventFilter")
    public JAXBElement<EventFilterType> createEventFilter(EventFilterType value) {
        return new JAXBElement<EventFilterType>(_EventFilter_QNAME, EventFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventStatusEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eventStatus")
    public JAXBElement<EventStatusEnumeratedType> createEventStatus(EventStatusEnumeratedType value) {
        return new JAXBElement<EventStatusEnumeratedType>(_EventStatus_QNAME, EventStatusEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "x-eiRampUp")
    public JAXBElement<DurationPropType> createXEiRampUp(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_XEiRampUp_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "resourceID")
    public JAXBElement<String> createResourceID(String value) {
        return new JAXBElement<String>(_ResourceID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "date-time")
    public JAXBElement<DateTime> createDateTime(DateTime value) {
        return new JAXBElement<DateTime>(_DateTime_QNAME, DateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "modificationNumber")
    public JAXBElement<Long> createModificationNumber(Long value) {
        return new JAXBElement<Long>(_ModificationNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "optType")
    public JAXBElement<OptTypeType> createOptType(OptTypeType value) {
        return new JAXBElement<OptTypeType>(_OptType_QNAME, OptTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eventID")
    public JAXBElement<String> createEventID(String value) {
        return new JAXBElement<String>(_EventID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "venID")
    public JAXBElement<String> createVenID(String value) {
        return new JAXBElement<String>(_VenID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "components")
    public JAXBElement<Object> createComponents(Object value) {
        return new JAXBElement<Object>(_Components_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignalTypeEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "signalType")
    public JAXBElement<SignalTypeEnumeratedType> createSignalType(SignalTypeEnumeratedType value) {
        return new JAXBElement<SignalTypeEnumeratedType>(_SignalType_QNAME, SignalTypeEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06", name = "marketContext")
    public JAXBElement<MarketContext> createMarketContext(MarketContext value) {
        return new JAXBElement<MarketContext>(_MarketContext_QNAME, MarketContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", name = "requestID")
    public JAXBElement<String> createRequestID(String value) {
        return new JAXBElement<String>(_RequestID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "x-eiRecovery")
    public JAXBElement<DurationPropType> createXEiRecovery(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_XEiRecovery_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "duration")
    public JAXBElement<DurationPropType> createDuration(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_Duration_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "x-eiNotification")
    public JAXBElement<DurationPropType> createXEiNotification(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_XEiNotification_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "partyID")
    public JAXBElement<String> createPartyID(String value) {
        return new JAXBElement<String>(_PartyID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", name = "replyLimit")
    public JAXBElement<Long> createReplyLimit(Long value) {
        return new JAXBElement<Long>(_ReplyLimit_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "vtnID")
    public JAXBElement<String> createVtnID(String value) {
        return new JAXBElement<String>(_VtnID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "groupID")
    public JAXBElement<String> createGroupID(String value) {
        return new JAXBElement<String>(_GroupID_QNAME, String.class, null, value);
    }

}
