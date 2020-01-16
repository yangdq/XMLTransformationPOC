//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 05:33:54 PM CST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monetaryFlowFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="monetaryFlowFrequency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WEEKLY"/&gt;
 *     &lt;enumeration value="MONTHLY"/&gt;
 *     &lt;enumeration value="ANNUALLY"/&gt;
 *     &lt;enumeration value="QUARTERLY"/&gt;
 *     &lt;enumeration value="BIWEEKLY"/&gt;
 *     &lt;enumeration value="SEMIMONTHLY"/&gt;
 *     &lt;enumeration value="HOURLY"/&gt;
 *     &lt;enumeration value="DAILY"/&gt;
 *     &lt;enumeration value="SEMIANNUALLY"/&gt;
 *     &lt;enumeration value="TIMES_PER_YEAR_13"/&gt;
 *     &lt;enumeration value="TIMES_PER_YEAR_11"/&gt;
 *     &lt;enumeration value="TIMES_PER_YEAR_10"/&gt;
 *     &lt;enumeration value="ONCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "monetaryFlowFrequency")
@XmlEnum
public enum MonetaryFlowFrequency {

    WEEKLY,
    MONTHLY,
    ANNUALLY,
    QUARTERLY,
    BIWEEKLY,
    SEMIMONTHLY,
    HOURLY,
    DAILY,
    SEMIANNUALLY,
    TIMES_PER_YEAR_13,
    TIMES_PER_YEAR_11,
    TIMES_PER_YEAR_10,
    ONCE;

    public String value() {
        return name();
    }

    public static MonetaryFlowFrequency fromValue(String v) {
        return valueOf(v);
    }

}
