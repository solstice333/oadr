//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.25 at 12:38:48 PM PDT 
//


package org.enernoc.open.oadr2.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for signalPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signalPayloadType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0:stream}StreamPayloadBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}payloadFloat"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signalPayloadType", propOrder = {
    "payloadFloat"
})
@Entity(name = "SignalPayload")
@Table(name = "SIGNALPAYLOAD")
public class SignalPayload
    extends StreamPayloadBase
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PayloadFloat payloadFloat;

    /**
     * Default no-arg constructor
     * 
     */
    public SignalPayload() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SignalPayload(final PayloadFloat payloadFloat) {
        super();
        this.payloadFloat = payloadFloat;
    }

    /**
     * Gets the value of the payloadFloat property.
     * 
     * @return
     *     possible object is
     *     {@link PayloadFloat }
     *     
     */
    @ManyToOne(targetEntity = PayloadFloat.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PAYLOADFLOAT_SIGNALPAYLOAD_H_0")
    public PayloadFloat getPayloadFloat() {
        return payloadFloat;
    }

    /**
     * Sets the value of the payloadFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadFloat }
     *     
     */
    public void setPayloadFloat(PayloadFloat value) {
        this.payloadFloat = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            PayloadFloat thePayloadFloat;
            thePayloadFloat = this.getPayloadFloat();
            strategy.appendField(locator, this, "payloadFloat", buffer, thePayloadFloat);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SignalPayload)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SignalPayload that = ((SignalPayload) object);
        {
            PayloadFloat lhsPayloadFloat;
            lhsPayloadFloat = this.getPayloadFloat();
            PayloadFloat rhsPayloadFloat;
            rhsPayloadFloat = that.getPayloadFloat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payloadFloat", lhsPayloadFloat), LocatorUtils.property(thatLocator, "payloadFloat", rhsPayloadFloat), lhsPayloadFloat, rhsPayloadFloat)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            PayloadFloat thePayloadFloat;
            thePayloadFloat = this.getPayloadFloat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payloadFloat", thePayloadFloat), currentHashCode, thePayloadFloat);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public SignalPayload withPayloadFloat(PayloadFloat value) {
        setPayloadFloat(value);
        return this;
    }

}
