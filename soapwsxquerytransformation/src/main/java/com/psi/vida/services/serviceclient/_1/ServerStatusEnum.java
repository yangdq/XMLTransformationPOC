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
 * <p>Java class for serverStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serverStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CM_SERVER_ALIVE"/&gt;
 *     &lt;enumeration value="CM_SERVER_OUT_OF_SERVICE"/&gt;
 *     &lt;enumeration value="CM_DB_SERVER_ALIVE"/&gt;
 *     &lt;enumeration value="CM_DB_SERVER_OUT_OF_SERVICE"/&gt;
 *     &lt;enumeration value="CM_SERVER_LIMITED_SERVICE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "serverStatusEnum")
@XmlEnum
public enum ServerStatusEnum {

    CM_SERVER_ALIVE,
    CM_SERVER_OUT_OF_SERVICE,
    CM_DB_SERVER_ALIVE,
    CM_DB_SERVER_OUT_OF_SERVICE,
    CM_SERVER_LIMITED_SERVICE;

    public String value() {
        return name();
    }

    public static ServerStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
