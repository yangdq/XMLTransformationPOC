//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:54 PM CST 
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
 * &lt;complexType name="healthPlanChangeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dentalPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
