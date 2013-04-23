//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.23 at 04:06:37 PM PDT 
//


package org.enernoc.open.oadr2.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for eiEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eiEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventDescriptor"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiActivePeriod"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiEventSignals"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiTarget"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiEventType", propOrder = {
    "eventDescriptor",
    "eiActivePeriod",
    "eiEventSignals",
    "eiTarget"
})
@Entity(name = "EiEvent")
@Table(name = "EIEVENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class EiEvent implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected EventDescriptor eventDescriptor;
    @XmlElement(required = true)
    protected EiActivePeriod eiActivePeriod;
    @XmlElement(required = true)
    protected EiEventSignals eiEventSignals;
    @XmlElement(required = true)
    protected EiTarget eiTarget;
    @XmlTransient
    protected Long hjid;

    /**
     * Default no-arg constructor
     * 
     */
    public EiEvent() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EiEvent(final EventDescriptor eventDescriptor, final EiActivePeriod eiActivePeriod, final EiEventSignals eiEventSignals, final EiTarget eiTarget) {
        this.eventDescriptor = eventDescriptor;
        this.eiActivePeriod = eiActivePeriod;
        this.eiEventSignals = eiEventSignals;
        this.eiTarget = eiTarget;
    }

    /**
     * Gets the value of the eventDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link EventDescriptor }
     *     
     */
    @ManyToOne(targetEntity = EventDescriptor.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENTDESCRIPTOR_EIEVENT_HJID")
    public EventDescriptor getEventDescriptor() {
        return eventDescriptor;
    }

    /**
     * Sets the value of the eventDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDescriptor }
     *     
     */
    public void setEventDescriptor(EventDescriptor value) {
        this.eventDescriptor = value;
    }

    /**
     * Gets the value of the eiActivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EiActivePeriod }
     *     
     */
    @ManyToOne(targetEntity = EiActivePeriod.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EIACTIVEPERIOD_EIEVENT_HJID")
    public EiActivePeriod getEiActivePeriod() {
        return eiActivePeriod;
    }

    /**
     * Sets the value of the eiActivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiActivePeriod }
     *     
     */
    public void setEiActivePeriod(EiActivePeriod value) {
        this.eiActivePeriod = value;
    }

    /**
     * Gets the value of the eiEventSignals property.
     * 
     * @return
     *     possible object is
     *     {@link EiEventSignals }
     *     
     */
    @ManyToOne(targetEntity = EiEventSignals.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EIEVENTSIGNALS_EIEVENT_HJID")
    public EiEventSignals getEiEventSignals() {
        return eiEventSignals;
    }

    /**
     * Sets the value of the eiEventSignals property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiEventSignals }
     *     
     */
    public void setEiEventSignals(EiEventSignals value) {
        this.eiEventSignals = value;
    }

    /**
     * Gets the value of the eiTarget property.
     * 
     * @return
     *     possible object is
     *     {@link EiTarget }
     *     
     */
    @ManyToOne(targetEntity = EiTarget.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EITARGET_EIEVENT_HJID")
    public EiTarget getEiTarget() {
        return eiTarget;
    }

    /**
     * Sets the value of the eiTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTarget }
     *     
     */
    public void setEiTarget(EiTarget value) {
        this.eiTarget = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            EventDescriptor theEventDescriptor;
            theEventDescriptor = this.getEventDescriptor();
            strategy.appendField(locator, this, "eventDescriptor", buffer, theEventDescriptor);
        }
        {
            EiActivePeriod theEiActivePeriod;
            theEiActivePeriod = this.getEiActivePeriod();
            strategy.appendField(locator, this, "eiActivePeriod", buffer, theEiActivePeriod);
        }
        {
            EiEventSignals theEiEventSignals;
            theEiEventSignals = this.getEiEventSignals();
            strategy.appendField(locator, this, "eiEventSignals", buffer, theEiEventSignals);
        }
        {
            EiTarget theEiTarget;
            theEiTarget = this.getEiTarget();
            strategy.appendField(locator, this, "eiTarget", buffer, theEiTarget);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EiEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EiEvent that = ((EiEvent) object);
        {
            EventDescriptor lhsEventDescriptor;
            lhsEventDescriptor = this.getEventDescriptor();
            EventDescriptor rhsEventDescriptor;
            rhsEventDescriptor = that.getEventDescriptor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventDescriptor", lhsEventDescriptor), LocatorUtils.property(thatLocator, "eventDescriptor", rhsEventDescriptor), lhsEventDescriptor, rhsEventDescriptor)) {
                return false;
            }
        }
        {
            EiActivePeriod lhsEiActivePeriod;
            lhsEiActivePeriod = this.getEiActivePeriod();
            EiActivePeriod rhsEiActivePeriod;
            rhsEiActivePeriod = that.getEiActivePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eiActivePeriod", lhsEiActivePeriod), LocatorUtils.property(thatLocator, "eiActivePeriod", rhsEiActivePeriod), lhsEiActivePeriod, rhsEiActivePeriod)) {
                return false;
            }
        }
        {
            EiEventSignals lhsEiEventSignals;
            lhsEiEventSignals = this.getEiEventSignals();
            EiEventSignals rhsEiEventSignals;
            rhsEiEventSignals = that.getEiEventSignals();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eiEventSignals", lhsEiEventSignals), LocatorUtils.property(thatLocator, "eiEventSignals", rhsEiEventSignals), lhsEiEventSignals, rhsEiEventSignals)) {
                return false;
            }
        }
        {
            EiTarget lhsEiTarget;
            lhsEiTarget = this.getEiTarget();
            EiTarget rhsEiTarget;
            rhsEiTarget = that.getEiTarget();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eiTarget", lhsEiTarget), LocatorUtils.property(thatLocator, "eiTarget", rhsEiTarget), lhsEiTarget, rhsEiTarget)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            EventDescriptor theEventDescriptor;
            theEventDescriptor = this.getEventDescriptor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventDescriptor", theEventDescriptor), currentHashCode, theEventDescriptor);
        }
        {
            EiActivePeriod theEiActivePeriod;
            theEiActivePeriod = this.getEiActivePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiActivePeriod", theEiActivePeriod), currentHashCode, theEiActivePeriod);
        }
        {
            EiEventSignals theEiEventSignals;
            theEiEventSignals = this.getEiEventSignals();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiEventSignals", theEiEventSignals), currentHashCode, theEiEventSignals);
        }
        {
            EiTarget theEiTarget;
            theEiTarget = this.getEiTarget();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiTarget", theEiTarget), currentHashCode, theEiTarget);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public EiEvent withEventDescriptor(EventDescriptor value) {
        setEventDescriptor(value);
        return this;
    }

    public EiEvent withEiActivePeriod(EiActivePeriod value) {
        setEiActivePeriod(value);
        return this;
    }

    public EiEvent withEiEventSignals(EiEventSignals value) {
        setEiEventSignals(value);
        return this;
    }

    public EiEvent withEiTarget(EiTarget value) {
        setEiTarget(value);
        return this;
    }

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "Hjid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
