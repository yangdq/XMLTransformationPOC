//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.09 at 03:15:58 PM IST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for healthPlanChangeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="healthPlanChangeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dentalPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicalPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "healthPlanChangeRequest", propOrder = {
    "dentalPlan",
    "medicalPlan"
})
public class HealthPlanChangeRequest {

    protected String dentalPlan;
    protected String medicalPlan;

    /**
     * Gets the value of the dentalPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDentalPlan() {
        return dentalPlan;
    }

    /**
     * Sets the value of the dentalPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDentalPlan(String value) {
        this.dentalPlan = value;
    }

    /**
     * Gets the value of the medicalPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalPlan() {
        return medicalPlan;
    }

    /**
     * Sets the value of the medicalPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalPlan(String value) {
        this.medicalPlan = value;
    }

}
