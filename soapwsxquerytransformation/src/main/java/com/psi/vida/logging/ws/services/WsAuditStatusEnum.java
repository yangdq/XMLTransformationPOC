//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:54 PM CST 
//


package com.psi.vida.logging.ws.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsAuditStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="wsAuditStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REQUEST_RECEIVED"/&gt;
 *     &lt;enumeration value="REPLY_SENT"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "wsAuditStatusEnum")
@XmlEnum
public enum WsAuditStatusEnum {

    REQUEST_RECEIVED,
    REPLY_SENT,
    FAILURE;

    public String value() {
        return name();
    }

    public static WsAuditStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
