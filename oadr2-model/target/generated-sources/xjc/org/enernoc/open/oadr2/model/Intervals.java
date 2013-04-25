//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.25 at 12:38:48 PM PDT 
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}interval" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intervals"
})
@XmlRootElement(name = "intervals", namespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream")
@Entity(name = "Intervals")
@Table(name = "INTERVALS")
@Inheritance(strategy = InheritanceType.JOINED)
public class Intervals implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "interval", required = true)
    protected List<Interval> intervals;
    @XmlTransient
    protected Long hjid;

    /**
     * Default no-arg constructor
     * 
     */
    public Intervals() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Intervals(final List<Interval> intervals) {
        this.intervals = intervals;
    }

    /**
     * Gets the value of the intervals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interval }
     * 
     * 
     */
    @OneToMany(targetEntity = Interval.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "INTERVALS_INTERVALS_HJID")
    public List<Interval> getIntervals() {
        if (intervals == null) {
            intervals = new ArrayList<Interval>();
        }
        return this.intervals;
    }

    /**
     * 
     * 
     */
    public void setIntervals(List<Interval> intervals) {
        this.intervals = intervals;
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
            List<Interval> theIntervals;
            theIntervals = (((this.intervals!= null)&&(!this.intervals.isEmpty()))?this.getIntervals():null);
            strategy.appendField(locator, this, "intervals", buffer, theIntervals);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Intervals)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Intervals that = ((Intervals) object);
        {
            List<Interval> lhsIntervals;
            lhsIntervals = (((this.intervals!= null)&&(!this.intervals.isEmpty()))?this.getIntervals():null);
            List<Interval> rhsIntervals;
            rhsIntervals = (((that.intervals!= null)&&(!that.intervals.isEmpty()))?that.getIntervals():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intervals", lhsIntervals), LocatorUtils.property(thatLocator, "intervals", rhsIntervals), lhsIntervals, rhsIntervals)) {
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
            List<Interval> theIntervals;
            theIntervals = (((this.intervals!= null)&&(!this.intervals.isEmpty()))?this.getIntervals():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intervals", theIntervals), currentHashCode, theIntervals);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Intervals withIntervals(Interval... values) {
        if (values!= null) {
            for (Interval value: values) {
                getIntervals().add(value);
            }
        }
        return this;
    }

    public Intervals withIntervals(Collection<Interval> values) {
        if (values!= null) {
            getIntervals().addAll(values);
        }
        return this;
    }

    public Intervals withIntervals(List<Interval> intervals) {
        setIntervals(intervals);
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
