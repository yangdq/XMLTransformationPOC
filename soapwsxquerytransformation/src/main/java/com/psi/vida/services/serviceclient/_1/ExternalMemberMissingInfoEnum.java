//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.09 at 03:15:58 PM IST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for externalMemberMissingInfoEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="externalMemberMissingInfoEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARENT_ONE_FIRST_NAME_BLANK"/>
 *     &lt;enumeration value="PARENT_ONE_LAST_NAME_BLANK"/>
 *     &lt;enumeration value="PARENT_ONE_SSN_BLANK"/>
 *     &lt;enumeration value="PARENT_ONE_DOB_BLANK"/>
 *     &lt;enumeration value="PARENT_TWO_FIRST_NAME_BLANK"/>
 *     &lt;enumeration value="PARENT_TWO_LAST_NAME_BLANK"/>
 *     &lt;enumeration value="PARENT_TWO_SSN_BLANK"/>
 *     &lt;enumeration value="PARENT_TWO_DOB_BLANK"/>
 *     &lt;enumeration value="CHILD_DOB_BLANK"/>
 *     &lt;enumeration value="CHILD_GENDER_BLANK"/>
 *     &lt;enumeration value="CHILD_DECLARED_CITIZENSHIP_BLANK"/>
 *     &lt;enumeration value="CHILD_NONCITIZEN_UNVERIFIED"/>
 *     &lt;enumeration value="CHILD_CITIZEN_UNVERIFIED"/>
 *     &lt;enumeration value="CHILD_PARENT_ONE_BLANK"/>
 *     &lt;enumeration value="CHILD_PARENT_TWO_BLANK"/>
 *     &lt;enumeration value="CHILD_FIRST_NAME_BLANK"/>
 *     &lt;enumeration value="CHILD_LAST_NAME_BLANK"/>
 *     &lt;enumeration value="CHILD_PRESENCE_HOUSEHOLD_UNKNOWN"/>
 *     &lt;enumeration value="CHILD_SSN_BLANK"/>
 *     &lt;enumeration value="CHILD_OTHER_INSURANCE_BLANK"/>
 *     &lt;enumeration value="CHILD_OTHER_INSURANCE_NAME_BLANK"/>
 *     &lt;enumeration value="CHILD_OTHER_INSURANCE_COST_BLANK"/>
 *     &lt;enumeration value="CHILD_VOL_CANC_INS_BLANK"/>
 *     &lt;enumeration value="CHILD_VOL_CANC_INS_DATE_BLANK"/>
 *     &lt;enumeration value="CHILD_TRIBAL_MMBRSHP_UNVERIFIED"/>
 *     &lt;enumeration value="SIBLING_DATE_OF_BIRTH_BLANK"/>
 *     &lt;enumeration value="SIBLING_PARENT_ONE_BLANK"/>
 *     &lt;enumeration value="SIBLING_PARENT_TWO_BLANK"/>
 *     &lt;enumeration value="PARENT_OTHER_FIRST_NAME_BLANK"/>
 *     &lt;enumeration value="PARENT_OTHER_LAST_NAME_BLANK"/>
 *     &lt;enumeration value="PARENT_OTHER_SSN_BLANK"/>
 *     &lt;enumeration value="SPECIAL_NEEDS_BLANK"/>
 *     &lt;enumeration value="APPLYING_FOR_KIDCARE_BLANK"/>
 *     &lt;enumeration value="CHILD_IDENTITY_UNVERIFIED"/>
 *     &lt;enumeration value="CHILD_MDCD_REFERRAL_PENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "externalMemberMissingInfoEnum")
@XmlEnum
public enum ExternalMemberMissingInfoEnum {

    PARENT_ONE_FIRST_NAME_BLANK,
    PARENT_ONE_LAST_NAME_BLANK,
    PARENT_ONE_SSN_BLANK,
    PARENT_ONE_DOB_BLANK,
    PARENT_TWO_FIRST_NAME_BLANK,
    PARENT_TWO_LAST_NAME_BLANK,
    PARENT_TWO_SSN_BLANK,
    PARENT_TWO_DOB_BLANK,
    CHILD_DOB_BLANK,
    CHILD_GENDER_BLANK,
    CHILD_DECLARED_CITIZENSHIP_BLANK,
    CHILD_NONCITIZEN_UNVERIFIED,
    CHILD_CITIZEN_UNVERIFIED,
    CHILD_PARENT_ONE_BLANK,
    CHILD_PARENT_TWO_BLANK,
    CHILD_FIRST_NAME_BLANK,
    CHILD_LAST_NAME_BLANK,
    CHILD_PRESENCE_HOUSEHOLD_UNKNOWN,
    CHILD_SSN_BLANK,
    CHILD_OTHER_INSURANCE_BLANK,
    CHILD_OTHER_INSURANCE_NAME_BLANK,
    CHILD_OTHER_INSURANCE_COST_BLANK,
    CHILD_VOL_CANC_INS_BLANK,
    CHILD_VOL_CANC_INS_DATE_BLANK,
    CHILD_TRIBAL_MMBRSHP_UNVERIFIED,
    SIBLING_DATE_OF_BIRTH_BLANK,
    SIBLING_PARENT_ONE_BLANK,
    SIBLING_PARENT_TWO_BLANK,
    PARENT_OTHER_FIRST_NAME_BLANK,
    PARENT_OTHER_LAST_NAME_BLANK,
    PARENT_OTHER_SSN_BLANK,
    SPECIAL_NEEDS_BLANK,
    APPLYING_FOR_KIDCARE_BLANK,
    CHILD_IDENTITY_UNVERIFIED,
    CHILD_MDCD_REFERRAL_PENDING;

    public String value() {
        return name();
    }

    public static ExternalMemberMissingInfoEnum fromValue(String v) {
        return valueOf(v);
    }

}
