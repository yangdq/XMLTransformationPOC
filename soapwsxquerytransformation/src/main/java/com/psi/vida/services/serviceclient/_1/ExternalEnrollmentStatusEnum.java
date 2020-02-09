//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:54 PM CST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for externalEnrollmentStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="externalEnrollmentStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANCELED_MEDICAID_APPROVED"/&gt;
 *     &lt;enumeration value="CANCELED_MEDICAID_NON_COMPLIANT"/&gt;
 *     &lt;enumeration value="CANCELED_NON_CITIZEN_NON_QUALIFIED"/&gt;
 *     &lt;enumeration value="CANCELED_NON_COMPLIANT"/&gt;
 *     &lt;enumeration value="CANCELED_NON_PAYMENT"/&gt;
 *     &lt;enumeration value="CANCELED_ON_MEDICAID"/&gt;
 *     &lt;enumeration value="CANCELED_OTHER"/&gt;
 *     &lt;enumeration value="CANCELED_OTHER_INS"/&gt;
 *     &lt;enumeration value="CANCELED_OUT_OF_HH"/&gt;
 *     &lt;enumeration value="CANCELED_OUT_OF_STATE"/&gt;
 *     &lt;enumeration value="CANCELED_OVER_AGE"/&gt;
 *     &lt;enumeration value="CANCELED_UNDER_AGE"/&gt;
 *     &lt;enumeration value="DENIED_MEDICAID_APPROVED"/&gt;
 *     &lt;enumeration value="DENIED_MEDICAID_NON_COMPLIANT"/&gt;
 *     &lt;enumeration value="DENIED_NON_CITIZEN_NON_QUALIFIED"/&gt;
 *     &lt;enumeration value="DENIED_NON_COMPLIANT"/&gt;
 *     &lt;enumeration value="DENIED_NON_PAYMENT"/&gt;
 *     &lt;enumeration value="DENIED_ON_MEDICAID"/&gt;
 *     &lt;enumeration value="DENIED_OTHER"/&gt;
 *     &lt;enumeration value="DENIED_OTHER_INS"/&gt;
 *     &lt;enumeration value="DENIED_OUT_OF_HH"/&gt;
 *     &lt;enumeration value="DENIED_OUT_OF_STATE"/&gt;
 *     &lt;enumeration value="DENIED_OVER_AGE"/&gt;
 *     &lt;enumeration value="DENIED_UNDER_AGE"/&gt;
 *     &lt;enumeration value="ENROLLED"/&gt;
 *     &lt;enumeration value="PENDING_ENROLLMENT"/&gt;
 *     &lt;enumeration value="PENDING_MEDICAID_REFERRAL"/&gt;
 *     &lt;enumeration value="PENDING_PREMIUM_PAYMENT"/&gt;
 *     &lt;enumeration value="PENDING_VERIFICATIONS"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "externalEnrollmentStatusEnum")
@XmlEnum
public enum ExternalEnrollmentStatusEnum {

    CANCELED_MEDICAID_APPROVED,
    CANCELED_MEDICAID_NON_COMPLIANT,
    CANCELED_NON_CITIZEN_NON_QUALIFIED,
    CANCELED_NON_COMPLIANT,
    CANCELED_NON_PAYMENT,
    CANCELED_ON_MEDICAID,
    CANCELED_OTHER,
    CANCELED_OTHER_INS,
    CANCELED_OUT_OF_HH,
    CANCELED_OUT_OF_STATE,
    CANCELED_OVER_AGE,
    CANCELED_UNDER_AGE,
    DENIED_MEDICAID_APPROVED,
    DENIED_MEDICAID_NON_COMPLIANT,
    DENIED_NON_CITIZEN_NON_QUALIFIED,
    DENIED_NON_COMPLIANT,
    DENIED_NON_PAYMENT,
    DENIED_ON_MEDICAID,
    DENIED_OTHER,
    DENIED_OTHER_INS,
    DENIED_OUT_OF_HH,
    DENIED_OUT_OF_STATE,
    DENIED_OVER_AGE,
    DENIED_UNDER_AGE,
    ENROLLED,
    PENDING_ENROLLMENT,
    PENDING_MEDICAID_REFERRAL,
    PENDING_PREMIUM_PAYMENT,
    PENDING_VERIFICATIONS,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ExternalEnrollmentStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
