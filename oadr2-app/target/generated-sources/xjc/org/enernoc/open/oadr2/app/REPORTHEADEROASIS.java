//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 04:27:19 PM PST 
//


package org.enernoc.open.oadr2.app;

import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
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
 * <p>Java class for REPORT_HEADEROASIS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REPORT_HEADEROASIS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SYSTEM" type="{http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd}SystemType"/>
 *         &lt;element name="TZ" type="{http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd}TimeZoneType"/>
 *         &lt;element name="REPORT" type="{http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd}OASISReportType"/>
 *         &lt;element name="MKT_TYPE" type="{http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd}OASISMarketType" minOccurs="0"/>
 *         &lt;element name="EXECUTION_TYPE" type="{http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd}OASISMarketType" minOccurs="0"/>
 *         &lt;element name="CRR_MKT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOM" type="{http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd}UOMType" minOccurs="0"/>
 *         &lt;element name="INTERVAL" type="{http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd}OASISIntervalType"/>
 *         &lt;element name="SEC_PER_INTERVAL" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REPORT_HEADEROASIS", propOrder = {
    "system",
    "tz",
    "report",
    "mkttype",
    "executiontype",
    "crrmktname",
    "uom",
    "interval",
    "secperinterval"
})
@Entity(name = "REPORTHEADEROASIS")
@Table(name = "REPORTHEADEROASIS")
@Inheritance(strategy = InheritanceType.JOINED)
public class REPORTHEADEROASIS implements Equals, HashCode, ToString
{

    @XmlElement(name = "SYSTEM", required = true)
    protected SystemType system;
    @XmlElement(name = "TZ", required = true)
    protected TimeZoneType tz;
    @XmlElement(name = "REPORT", required = true)
    protected OASISReportType report;
    @XmlElementRef(name = "MKT_TYPE", namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", type = JAXBElement.class)
    protected JAXBElement<String> mkttype;
    @XmlElementRef(name = "EXECUTION_TYPE", namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", type = JAXBElement.class)
    protected JAXBElement<String> executiontype;
    @XmlElementRef(name = "CRR_MKT_NAME", namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", type = JAXBElement.class)
    protected JAXBElement<String> crrmktname;
    @XmlElementRef(name = "UOM", namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", type = JAXBElement.class)
    protected JAXBElement<String> uom;
    @XmlElement(name = "INTERVAL", required = true)
    protected OASISIntervalType interval;
    @XmlElement(name = "SEC_PER_INTERVAL", required = true)
    protected BigInteger secperinterval;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Default no-arg constructor
     * 
     */
    public REPORTHEADEROASIS() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public REPORTHEADEROASIS(final SystemType system, final TimeZoneType tz, final OASISReportType report, final JAXBElement<String> mkttype, final JAXBElement<String> executiontype, final JAXBElement<String> crrmktname, final JAXBElement<String> uom, final OASISIntervalType interval, final BigInteger secperinterval) {
        this.system = system;
        this.tz = tz;
        this.report = report;
        this.mkttype = mkttype;
        this.executiontype = executiontype;
        this.crrmktname = crrmktname;
        this.uom = uom;
        this.interval = interval;
        this.secperinterval = secperinterval;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link SystemType }
     *     
     */
    @Basic
    @Column(name = "SYSTEM_", length = 255)
    @Enumerated(EnumType.STRING)
    public SystemType getSYSTEM() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemType }
     *     
     */
    public void setSYSTEM(SystemType value) {
        this.system = value;
    }

    /**
     * Gets the value of the tz property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneType }
     *     
     */
    @Basic
    @Column(name = "TZ", length = 255)
    @Enumerated(EnumType.STRING)
    public TimeZoneType getTZ() {
        return tz;
    }

    /**
     * Sets the value of the tz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneType }
     *     
     */
    public void setTZ(TimeZoneType value) {
        this.tz = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link OASISReportType }
     *     
     */
    @Basic
    @Column(name = "REPORT", length = 255)
    @Enumerated(EnumType.STRING)
    public OASISReportType getREPORT() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link OASISReportType }
     *     
     */
    public void setREPORT(OASISReportType value) {
        this.report = value;
    }

    /**
     * Gets the value of the mkttype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Transient
    public JAXBElement<String> getMKTTYPE() {
        return mkttype;
    }

    /**
     * Sets the value of the mkttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMKTTYPE(JAXBElement<String> value) {
        this.mkttype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the executiontype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Transient
    public JAXBElement<String> getEXECUTIONTYPE() {
        return executiontype;
    }

    /**
     * Sets the value of the executiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXECUTIONTYPE(JAXBElement<String> value) {
        this.executiontype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crrmktname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Transient
    public JAXBElement<String> getCRRMKTNAME() {
        return crrmktname;
    }

    /**
     * Sets the value of the crrmktname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRRMKTNAME(JAXBElement<String> value) {
        this.crrmktname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Transient
    public JAXBElement<String> getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUOM(JAXBElement<String> value) {
        this.uom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link OASISIntervalType }
     *     
     */
    @Basic
    @Column(name = "INTERVAL_", length = 255)
    @Enumerated(EnumType.STRING)
    public OASISIntervalType getINTERVAL() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link OASISIntervalType }
     *     
     */
    public void setINTERVAL(OASISIntervalType value) {
        this.interval = value;
    }

    /**
     * Gets the value of the secperinterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "SECPERINTERVAL", precision = 20, scale = 0)
    public BigInteger getSECPERINTERVAL() {
        return secperinterval;
    }

    /**
     * Sets the value of the secperinterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSECPERINTERVAL(BigInteger value) {
        this.secperinterval = value;
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
            SystemType theSYSTEM;
            theSYSTEM = this.getSYSTEM();
            strategy.appendField(locator, this, "system", buffer, theSYSTEM);
        }
        {
            TimeZoneType theTZ;
            theTZ = this.getTZ();
            strategy.appendField(locator, this, "tz", buffer, theTZ);
        }
        {
            OASISReportType theREPORT;
            theREPORT = this.getREPORT();
            strategy.appendField(locator, this, "report", buffer, theREPORT);
        }
        {
            JAXBElement<String> theMKTTYPE;
            theMKTTYPE = this.getMKTTYPE();
            strategy.appendField(locator, this, "mkttype", buffer, theMKTTYPE);
        }
        {
            JAXBElement<String> theEXECUTIONTYPE;
            theEXECUTIONTYPE = this.getEXECUTIONTYPE();
            strategy.appendField(locator, this, "executiontype", buffer, theEXECUTIONTYPE);
        }
        {
            JAXBElement<String> theCRRMKTNAME;
            theCRRMKTNAME = this.getCRRMKTNAME();
            strategy.appendField(locator, this, "crrmktname", buffer, theCRRMKTNAME);
        }
        {
            JAXBElement<String> theUOM;
            theUOM = this.getUOM();
            strategy.appendField(locator, this, "uom", buffer, theUOM);
        }
        {
            OASISIntervalType theINTERVAL;
            theINTERVAL = this.getINTERVAL();
            strategy.appendField(locator, this, "interval", buffer, theINTERVAL);
        }
        {
            BigInteger theSECPERINTERVAL;
            theSECPERINTERVAL = this.getSECPERINTERVAL();
            strategy.appendField(locator, this, "secperinterval", buffer, theSECPERINTERVAL);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof REPORTHEADEROASIS)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final REPORTHEADEROASIS that = ((REPORTHEADEROASIS) object);
        {
            SystemType lhsSYSTEM;
            lhsSYSTEM = this.getSYSTEM();
            SystemType rhsSYSTEM;
            rhsSYSTEM = that.getSYSTEM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "system", lhsSYSTEM), LocatorUtils.property(thatLocator, "system", rhsSYSTEM), lhsSYSTEM, rhsSYSTEM)) {
                return false;
            }
        }
        {
            TimeZoneType lhsTZ;
            lhsTZ = this.getTZ();
            TimeZoneType rhsTZ;
            rhsTZ = that.getTZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tz", lhsTZ), LocatorUtils.property(thatLocator, "tz", rhsTZ), lhsTZ, rhsTZ)) {
                return false;
            }
        }
        {
            OASISReportType lhsREPORT;
            lhsREPORT = this.getREPORT();
            OASISReportType rhsREPORT;
            rhsREPORT = that.getREPORT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "report", lhsREPORT), LocatorUtils.property(thatLocator, "report", rhsREPORT), lhsREPORT, rhsREPORT)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsMKTTYPE;
            lhsMKTTYPE = this.getMKTTYPE();
            JAXBElement<String> rhsMKTTYPE;
            rhsMKTTYPE = that.getMKTTYPE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mkttype", lhsMKTTYPE), LocatorUtils.property(thatLocator, "mkttype", rhsMKTTYPE), lhsMKTTYPE, rhsMKTTYPE)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsEXECUTIONTYPE;
            lhsEXECUTIONTYPE = this.getEXECUTIONTYPE();
            JAXBElement<String> rhsEXECUTIONTYPE;
            rhsEXECUTIONTYPE = that.getEXECUTIONTYPE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "executiontype", lhsEXECUTIONTYPE), LocatorUtils.property(thatLocator, "executiontype", rhsEXECUTIONTYPE), lhsEXECUTIONTYPE, rhsEXECUTIONTYPE)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsCRRMKTNAME;
            lhsCRRMKTNAME = this.getCRRMKTNAME();
            JAXBElement<String> rhsCRRMKTNAME;
            rhsCRRMKTNAME = that.getCRRMKTNAME();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "crrmktname", lhsCRRMKTNAME), LocatorUtils.property(thatLocator, "crrmktname", rhsCRRMKTNAME), lhsCRRMKTNAME, rhsCRRMKTNAME)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsUOM;
            lhsUOM = this.getUOM();
            JAXBElement<String> rhsUOM;
            rhsUOM = that.getUOM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uom", lhsUOM), LocatorUtils.property(thatLocator, "uom", rhsUOM), lhsUOM, rhsUOM)) {
                return false;
            }
        }
        {
            OASISIntervalType lhsINTERVAL;
            lhsINTERVAL = this.getINTERVAL();
            OASISIntervalType rhsINTERVAL;
            rhsINTERVAL = that.getINTERVAL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interval", lhsINTERVAL), LocatorUtils.property(thatLocator, "interval", rhsINTERVAL), lhsINTERVAL, rhsINTERVAL)) {
                return false;
            }
        }
        {
            BigInteger lhsSECPERINTERVAL;
            lhsSECPERINTERVAL = this.getSECPERINTERVAL();
            BigInteger rhsSECPERINTERVAL;
            rhsSECPERINTERVAL = that.getSECPERINTERVAL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secperinterval", lhsSECPERINTERVAL), LocatorUtils.property(thatLocator, "secperinterval", rhsSECPERINTERVAL), lhsSECPERINTERVAL, rhsSECPERINTERVAL)) {
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
            SystemType theSYSTEM;
            theSYSTEM = this.getSYSTEM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "system", theSYSTEM), currentHashCode, theSYSTEM);
        }
        {
            TimeZoneType theTZ;
            theTZ = this.getTZ();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tz", theTZ), currentHashCode, theTZ);
        }
        {
            OASISReportType theREPORT;
            theREPORT = this.getREPORT();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "report", theREPORT), currentHashCode, theREPORT);
        }
        {
            JAXBElement<String> theMKTTYPE;
            theMKTTYPE = this.getMKTTYPE();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mkttype", theMKTTYPE), currentHashCode, theMKTTYPE);
        }
        {
            JAXBElement<String> theEXECUTIONTYPE;
            theEXECUTIONTYPE = this.getEXECUTIONTYPE();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "executiontype", theEXECUTIONTYPE), currentHashCode, theEXECUTIONTYPE);
        }
        {
            JAXBElement<String> theCRRMKTNAME;
            theCRRMKTNAME = this.getCRRMKTNAME();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crrmktname", theCRRMKTNAME), currentHashCode, theCRRMKTNAME);
        }
        {
            JAXBElement<String> theUOM;
            theUOM = this.getUOM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uom", theUOM), currentHashCode, theUOM);
        }
        {
            OASISIntervalType theINTERVAL;
            theINTERVAL = this.getINTERVAL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "interval", theINTERVAL), currentHashCode, theINTERVAL);
        }
        {
            BigInteger theSECPERINTERVAL;
            theSECPERINTERVAL = this.getSECPERINTERVAL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secperinterval", theSECPERINTERVAL), currentHashCode, theSECPERINTERVAL);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public REPORTHEADEROASIS withSYSTEM(SystemType value) {
        setSYSTEM(value);
        return this;
    }

    public REPORTHEADEROASIS withTZ(TimeZoneType value) {
        setTZ(value);
        return this;
    }

    public REPORTHEADEROASIS withREPORT(OASISReportType value) {
        setREPORT(value);
        return this;
    }

    public REPORTHEADEROASIS withMKTTYPE(JAXBElement<String> value) {
        setMKTTYPE(value);
        return this;
    }

    public REPORTHEADEROASIS withEXECUTIONTYPE(JAXBElement<String> value) {
        setEXECUTIONTYPE(value);
        return this;
    }

    public REPORTHEADEROASIS withCRRMKTNAME(JAXBElement<String> value) {
        setCRRMKTNAME(value);
        return this;
    }

    public REPORTHEADEROASIS withUOM(JAXBElement<String> value) {
        setUOM(value);
        return this;
    }

    public REPORTHEADEROASIS withINTERVAL(OASISIntervalType value) {
        setINTERVAL(value);
        return this;
    }

    public REPORTHEADEROASIS withSECPERINTERVAL(BigInteger value) {
        setSECPERINTERVAL(value);
        return this;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @Basic
    @Column(name = "MKTTYPEITEM", length = 255)
    public String getMKTTYPEItem() {
        return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getMKTTYPE()));
    }

    public void setMKTTYPEItem(String target) {
        setMKTTYPE(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "MKT_TYPE"), REPORTHEADEROASIS.class, target));
    }

    @Basic
    @Column(name = "EXECUTIONTYPEITEM", length = 255)
    public String getEXECUTIONTYPEItem() {
        return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getEXECUTIONTYPE()));
    }

    public void setEXECUTIONTYPEItem(String target) {
        setEXECUTIONTYPE(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "EXECUTION_TYPE"), REPORTHEADEROASIS.class, target));
    }

    @Basic
    @Column(name = "CRRMKTNAMEITEM", length = 255)
    public String getCRRMKTNAMEItem() {
        return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getCRRMKTNAME()));
    }

    public void setCRRMKTNAMEItem(String target) {
        setCRRMKTNAME(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "CRR_MKT_NAME"), REPORTHEADEROASIS.class, target));
    }

    @Basic
    @Column(name = "UOMITEM", length = 255)
    public String getUOMItem() {
        return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getUOM()));
    }

    public void setUOMItem(String target) {
        setUOM(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "UOM"), REPORTHEADEROASIS.class, target));
    }

}