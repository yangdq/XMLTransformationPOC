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
 * <p>Java class for expenseTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="expenseTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALIMONY"/&gt;
 *     &lt;enumeration value="STUDENT_LOAN_INTEREST"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="CHILD_SUPPORT"/&gt;
 *     &lt;enumeration value="DAYCARE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "expenseTypeEnum")
@XmlEnum
public enum ExpenseTypeEnum {

    ALIMONY,
    STUDENT_LOAN_INTEREST,
    OTHER,
    CHILD_SUPPORT,
    DAYCARE;

    public String value() {
        return name();
    }

    public static ExpenseTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
