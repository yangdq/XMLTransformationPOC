//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.22 at 11:47:15 AM CST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for raceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="raceEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMERICAN_INDIAN_OR_ALASKAN_NATIVE"/&gt;
 *     &lt;enumeration value="ASIAN"/&gt;
 *     &lt;enumeration value="BLACK_OR_AFRICAN_AMERICAN"/&gt;
 *     &lt;enumeration value="NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER"/&gt;
 *     &lt;enumeration value="WHITE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "raceEnum")
@XmlEnum
public enum RaceEnum {

    AMERICAN_INDIAN_OR_ALASKAN_NATIVE,
    ASIAN,
    BLACK_OR_AFRICAN_AMERICAN,
    NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER,
    WHITE;

    public String value() {
        return name();
    }

    public static RaceEnum fromValue(String v) {
        return valueOf(v);
    }

}
