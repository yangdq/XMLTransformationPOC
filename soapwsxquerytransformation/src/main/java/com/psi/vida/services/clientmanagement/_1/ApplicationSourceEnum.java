//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.22 at 11:47:16 AM CST 
//


package com.psi.vida.services.clientmanagement._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationSourceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="applicationSourceEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WEBSITE"/&gt;
 *     &lt;enumeration value="MDCD_CLOSURE"/&gt;
 *     &lt;enumeration value="MANUAL_ENTRY"/&gt;
 *     &lt;enumeration value="DATA_ENTRY"/&gt;
 *     &lt;enumeration value="OTHER_CONTACT"/&gt;
 *     &lt;enumeration value="MEDICAID"/&gt;
 *     &lt;enumeration value="FFM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "applicationSourceEnum")
@XmlEnum
public enum ApplicationSourceEnum {

    WEBSITE,
    MDCD_CLOSURE,
    MANUAL_ENTRY,
    DATA_ENTRY,
    OTHER_CONTACT,
    MEDICAID,
    FFM;

    public String value() {
        return name();
    }

    public static ApplicationSourceEnum fromValue(String v) {
        return valueOf(v);
    }

}
