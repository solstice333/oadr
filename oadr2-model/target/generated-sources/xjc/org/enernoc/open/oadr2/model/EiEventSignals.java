//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.24 at 01:18:53 AM PST 
//


package org.enernoc.open.oadr2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
 * <p>Java class for eiEventSignalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eiEventSignalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiEventSignal" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiEventSignalsType", propOrder = {
    "eiEventSignals"
})
@Entity(name = "EiEventSignals")
@Table(name = "EIEVENTSIGNALS")
@Inheritance(strategy = InheritanceType.JOINED)
public class EiEventSignals implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "eiEventSignal", required = true)
    protected List<EiEventSignal> eiEventSignals;
    @XmlTransient
    protected Long hjid;

    /**
     * Default no-arg constructor
     * 
     */
    public EiEventSignals() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EiEventSignals(final List<EiEventSignal> eiEventSignals) {
        this.eiEventSignals = eiEventSignals;
    }

    /**
     * Gets the value of the eiEventSignals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eiEventSignals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEiEventSignals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EiEventSignal }
     * 
     * 
     */
    @OneToMany(targetEntity = EiEventSignal.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EIEVENTSIGNALS_EIEVENTSIGNAL_0")
    public List<EiEventSignal> getEiEventSignals() {
        if (eiEventSignals == null) {
            eiEventSignals = new ArrayList<EiEventSignal>();
        }
        return this.eiEventSignals;
    }

    /**
     * 
     * 
     */
    public void setEiEventSignals(List<EiEventSignal> eiEventSignals) {
        this.eiEventSignals = eiEventSignals;
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
            List<EiEventSignal> theEiEventSignals;
            theEiEventSignals = (((this.eiEventSignals!= null)&&(!this.eiEventSignals.isEmpty()))?this.getEiEventSignals():null);
            strategy.appendField(locator, this, "eiEventSignals", buffer, theEiEventSignals);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EiEventSignals)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EiEventSignals that = ((EiEventSignals) object);
        {
            List<EiEventSignal> lhsEiEventSignals;
            lhsEiEventSignals = (((this.eiEventSignals!= null)&&(!this.eiEventSignals.isEmpty()))?this.getEiEventSignals():null);
            List<EiEventSignal> rhsEiEventSignals;
            rhsEiEventSignals = (((that.eiEventSignals!= null)&&(!that.eiEventSignals.isEmpty()))?that.getEiEventSignals():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eiEventSignals", lhsEiEventSignals), LocatorUtils.property(thatLocator, "eiEventSignals", rhsEiEventSignals), lhsEiEventSignals, rhsEiEventSignals)) {
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
            List<EiEventSignal> theEiEventSignals;
            theEiEventSignals = (((this.eiEventSignals!= null)&&(!this.eiEventSignals.isEmpty()))?this.getEiEventSignals():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eiEventSignals", theEiEventSignals), currentHashCode, theEiEventSignals);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public EiEventSignals withEiEventSignals(EiEventSignal... values) {
        if (values!= null) {
            for (EiEventSignal value: values) {
                getEiEventSignals().add(value);
            }
        }
        return this;
    }

    public EiEventSignals withEiEventSignals(Collection<EiEventSignal> values) {
        if (values!= null) {
            getEiEventSignals().addAll(values);
        }
        return this;
    }

    public EiEventSignals withEiEventSignals(List<EiEventSignal> eiEventSignals) {
        setEiEventSignals(eiEventSignals);
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
