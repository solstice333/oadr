//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.25 at 12:38:48 PM PDT 
//


package org.enernoc.open.oadr2.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for eiEventSignalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eiEventSignalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0:stream}intervals"/>
 *         &lt;element name="signalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}signalType"/>
 *         &lt;element name="signalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}currentValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiEventSignalType", propOrder = {
    "intervals",
    "signalName",
    "signalType",
    "signalID",
    "currentValue"
})
@XmlRootElement(name = "eiEventSignal")
@Entity(name = "EiEventSignal")
@Table(name = "EIEVENTSIGNAL")
@Inheritance(strategy = InheritanceType.JOINED)
public class EiEventSignal implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", required = true)
    protected Intervals intervals;
    @XmlElement(required = true)
    protected String signalName;
    @XmlElement(required = true)
    protected SignalTypeEnumeratedType signalType;
    @XmlElement(required = true)
    protected String signalID;
    @XmlElement(required = true)
    protected CurrentValue currentValue;
    @XmlTransient
    protected Long hjid;

    /**
     * Default no-arg constructor
     * 
     */
    public EiEventSignal() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EiEventSignal(final Intervals intervals, final String signalName, final SignalTypeEnumeratedType signalType, final String signalID, final CurrentValue currentValue) {
        this.intervals = intervals;
        this.signalName = signalName;
        this.signalType = signalType;
        this.signalID = signalID;
        this.currentValue = currentValue;
    }

    /**
     * Gets the value of the intervals property.
     * 
     * @return
     *     possible object is
     *     {@link Intervals }
     *     
     */
    @ManyToOne(targetEntity = Intervals.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "INTERVALS_EIEVENTSIGNAL_HJID")
    public Intervals getIntervals() {
        return intervals;
    }

    /**
     * Sets the value of the intervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Intervals }
     *     
     */
    public void setIntervals(Intervals value) {
        this.intervals = value;
    }

    /**
     * Gets the value of the signalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SIGNALNAME", length = 255)
    public String getSignalName() {
        return signalName;
    }

    /**
     * Sets the value of the signalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalName(String value) {
        this.signalName = value;
    }

    /**
     * Gets the value of the signalType property.
     * 
     * @return
     *     possible object is
     *     {@link SignalTypeEnumeratedType }
     *     
     */
    @Basic
    @Column(name = "SIGNALTYPE", length = 255)
    @Enumerated(EnumType.STRING)
    public SignalTypeEnumeratedType getSignalType() {
        return signalType;
    }

    /**
     * Sets the value of the signalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalTypeEnumeratedType }
     *     
     */
    public void setSignalType(SignalTypeEnumeratedType value) {
        this.signalType = value;
    }

    /**
     * Gets the value of the signalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SIGNALID", length = 255)
    public String getSignalID() {
        return signalID;
    }

    /**
     * Sets the value of the signalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalID(String value) {
        this.signalID = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentValue }
     *     
     */
    @ManyToOne(targetEntity = CurrentValue.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CURRENTVALUE_EIEVENTSIGNAL_H_0")
    public CurrentValue getCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentValue }
     *     
     */
    public void setCurrentValue(CurrentValue value) {
        this.currentValue = value;
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
            Intervals theIntervals;
            theIntervals = this.getIntervals();
            strategy.appendField(locator, this, "intervals", buffer, theIntervals);
        }
        {
            String theSignalName;
            theSignalName = this.getSignalName();
            strategy.appendField(locator, this, "signalName", buffer, theSignalName);
        }
        {
            SignalTypeEnumeratedType theSignalType;
            theSignalType = this.getSignalType();
            strategy.appendField(locator, this, "signalType", buffer, theSignalType);
        }
        {
            String theSignalID;
            theSignalID = this.getSignalID();
            strategy.appendField(locator, this, "signalID", buffer, theSignalID);
        }
        {
            CurrentValue theCurrentValue;
            theCurrentValue = this.getCurrentValue();
            strategy.appendField(locator, this, "currentValue", buffer, theCurrentValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EiEventSignal)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EiEventSignal that = ((EiEventSignal) object);
        {
            Intervals lhsIntervals;
            lhsIntervals = this.getIntervals();
            Intervals rhsIntervals;
            rhsIntervals = that.getIntervals();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intervals", lhsIntervals), LocatorUtils.property(thatLocator, "intervals", rhsIntervals), lhsIntervals, rhsIntervals)) {
                return false;
            }
        }
        {
            String lhsSignalName;
            lhsSignalName = this.getSignalName();
            String rhsSignalName;
            rhsSignalName = that.getSignalName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signalName", lhsSignalName), LocatorUtils.property(thatLocator, "signalName", rhsSignalName), lhsSignalName, rhsSignalName)) {
                return false;
            }
        }
        {
            SignalTypeEnumeratedType lhsSignalType;
            lhsSignalType = this.getSignalType();
            SignalTypeEnumeratedType rhsSignalType;
            rhsSignalType = that.getSignalType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signalType", lhsSignalType), LocatorUtils.property(thatLocator, "signalType", rhsSignalType), lhsSignalType, rhsSignalType)) {
                return false;
            }
        }
        {
            String lhsSignalID;
            lhsSignalID = this.getSignalID();
            String rhsSignalID;
            rhsSignalID = that.getSignalID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signalID", lhsSignalID), LocatorUtils.property(thatLocator, "signalID", rhsSignalID), lhsSignalID, rhsSignalID)) {
                return false;
            }
        }
        {
            CurrentValue lhsCurrentValue;
            lhsCurrentValue = this.getCurrentValue();
            CurrentValue rhsCurrentValue;
            rhsCurrentValue = that.getCurrentValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentValue", lhsCurrentValue), LocatorUtils.property(thatLocator, "currentValue", rhsCurrentValue), lhsCurrentValue, rhsCurrentValue)) {
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
            Intervals theIntervals;
            theIntervals = this.getIntervals();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intervals", theIntervals), currentHashCode, theIntervals);
        }
        {
            String theSignalName;
            theSignalName = this.getSignalName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signalName", theSignalName), currentHashCode, theSignalName);
        }
        {
            SignalTypeEnumeratedType theSignalType;
            theSignalType = this.getSignalType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signalType", theSignalType), currentHashCode, theSignalType);
        }
        {
            String theSignalID;
            theSignalID = this.getSignalID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signalID", theSignalID), currentHashCode, theSignalID);
        }
        {
            CurrentValue theCurrentValue;
            theCurrentValue = this.getCurrentValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentValue", theCurrentValue), currentHashCode, theCurrentValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public EiEventSignal withIntervals(Intervals value) {
        setIntervals(value);
        return this;
    }

    public EiEventSignal withSignalName(String value) {
        setSignalName(value);
        return this;
    }

    public EiEventSignal withSignalType(SignalTypeEnumeratedType value) {
        setSignalType(value);
        return this;
    }

    public EiEventSignal withSignalID(String value) {
        setSignalID(value);
        return this;
    }

    public EiEventSignal withCurrentValue(CurrentValue value) {
        setCurrentValue(value);
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