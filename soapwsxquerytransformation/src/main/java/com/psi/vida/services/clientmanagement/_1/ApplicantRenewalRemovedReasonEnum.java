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
 * <p>Java class for applicantRenewalRemovedReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="applicantRenewalRemovedReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MOVED_OUT_OF_HOUSEHOLD"/&gt;
 *     &lt;enumeration value="DEATH"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "applicantRenewalRemovedReasonEnum")
@XmlEnum
public enum ApplicantRenewalRemovedReasonEnum {

    MOVED_OUT_OF_HOUSEHOLD,
    DEATH,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ApplicantRenewalRemovedReasonEnum fromValue(String v) {
        return valueOf(v);
    }

}
