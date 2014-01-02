//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.24 at 01:18:53 AM PST 
//


package org.enernoc.open.oadr2.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="optIn"/>
 *     &lt;enumeration value="optOut"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptTypeType")
@XmlEnum
public enum OptTypeType {

    @XmlEnumValue("optIn")
    OPT_IN("optIn"),
    @XmlEnumValue("optOut")
    OPT_OUT("optOut");
    private final String value;

    OptTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptTypeType fromValue(String v) {
        for (OptTypeType c: OptTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
