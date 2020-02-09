//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationStatusReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="applicationStatusReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="INCOMPLETE_HOME_ADDRESS"/&gt;
 *     &lt;enumeration value="INCOMPLETE_HOME_ADDRESS_CITY"/&gt;
 *     &lt;enumeration value="INCOMPLETE_HOME_ADDRESS_STATE"/&gt;
 *     &lt;enumeration value="INCOMPLETE_HOME_ADDRESS_STREET"/&gt;
 *     &lt;enumeration value="INCOMPLETE_HOME_ADDRESS_ZIP"/&gt;
 *     &lt;enumeration value="MISSING_PARENT1"/&gt;
 *     &lt;enumeration value="MISSING_PARENT_DOB_SSN"/&gt;
 *     &lt;enumeration value="MISSING_PARENT_FIRST_NAME"/&gt;
 *     &lt;enumeration value="MISSING_PARENT_LAST_NAME"/&gt;
 *     &lt;enumeration value="MISSING_CHILD_FIRST_NAME"/&gt;
 *     &lt;enumeration value="MISSING_CHILD_LAST_NAME"/&gt;
 *     &lt;enumeration value="MISSING_CHILD_DOB"/&gt;
 *     &lt;enumeration value="MISSING_OTHER_FIRST_NAME"/&gt;
 *     &lt;enumeration value="MISSING_OTHER_LAST_NAME"/&gt;
 *     &lt;enumeration value="MISSING_OTHER_DOB"/&gt;
 *     &lt;enumeration value="DECEASED_MEMBER"/&gt;
 *     &lt;enumeration value="DIFFERENT_CITIZENSHIP"/&gt;
 *     &lt;enumeration value="DIFFERENT_RELATIONSHIP"/&gt;
 *     &lt;enumeration value="DUPLICATE_SSN"/&gt;
 *     &lt;enumeration value="DUPLICATE_APP_PERSON"/&gt;
 *     &lt;enumeration value="MISSING_BIOLOGICAL_PARENT"/&gt;
 *     &lt;enumeration value="MISSING_MEMBER"/&gt;
 *     &lt;enumeration value="MULTIPLE_MEMBERS"/&gt;
 *     &lt;enumeration value="MULTIPLE_ACTIVE_ACCOUNTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "applicationStatusReasonEnum")
@XmlEnum
public enum ApplicationStatusReasonEnum {

    NONE("NONE"),
    INCOMPLETE_HOME_ADDRESS("INCOMPLETE_HOME_ADDRESS"),
    INCOMPLETE_HOME_ADDRESS_CITY("INCOMPLETE_HOME_ADDRESS_CITY"),
    INCOMPLETE_HOME_ADDRESS_STATE("INCOMPLETE_HOME_ADDRESS_STATE"),
    INCOMPLETE_HOME_ADDRESS_STREET("INCOMPLETE_HOME_ADDRESS_STREET"),
    INCOMPLETE_HOME_ADDRESS_ZIP("INCOMPLETE_HOME_ADDRESS_ZIP"),
    @XmlEnumValue("MISSING_PARENT1")
    MISSING_PARENT_1("MISSING_PARENT1"),
    MISSING_PARENT_DOB_SSN("MISSING_PARENT_DOB_SSN"),
    MISSING_PARENT_FIRST_NAME("MISSING_PARENT_FIRST_NAME"),
    MISSING_PARENT_LAST_NAME("MISSING_PARENT_LAST_NAME"),
    MISSING_CHILD_FIRST_NAME("MISSING_CHILD_FIRST_NAME"),
    MISSING_CHILD_LAST_NAME("MISSING_CHILD_LAST_NAME"),
    MISSING_CHILD_DOB("MISSING_CHILD_DOB"),
    MISSING_OTHER_FIRST_NAME("MISSING_OTHER_FIRST_NAME"),
    MISSING_OTHER_LAST_NAME("MISSING_OTHER_LAST_NAME"),
    MISSING_OTHER_DOB("MISSING_OTHER_DOB"),
    DECEASED_MEMBER("DECEASED_MEMBER"),
    DIFFERENT_CITIZENSHIP("DIFFERENT_CITIZENSHIP"),
    DIFFERENT_RELATIONSHIP("DIFFERENT_RELATIONSHIP"),
    DUPLICATE_SSN("DUPLICATE_SSN"),
    DUPLICATE_APP_PERSON("DUPLICATE_APP_PERSON"),
    MISSING_BIOLOGICAL_PARENT("MISSING_BIOLOGICAL_PARENT"),
    MISSING_MEMBER("MISSING_MEMBER"),
    MULTIPLE_MEMBERS("MULTIPLE_MEMBERS"),
    MULTIPLE_ACTIVE_ACCOUNTS("MULTIPLE_ACTIVE_ACCOUNTS");
    private final String value;

    ApplicationStatusReasonEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationStatusReasonEnum fromValue(String v) {
        for (ApplicationStatusReasonEnum c: ApplicationStatusReasonEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
