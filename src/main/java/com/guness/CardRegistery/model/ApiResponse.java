
package com.guness.CardRegistery.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExceptionData" type="{http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common}ArrayOfApiEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiResponse", namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", propOrder = {
    "exceptionData"
})
@XmlSeeAlso({
    CardServiceResponse.class,
    ValidateCardServiceResponse.class
})
public class ApiResponse {

    @XmlElementRef(name = "ExceptionData", namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfApiEx> exceptionData;

    /**
     * Gets the value of the exceptionData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfApiEx }{@code >}
     *     
     */
    public JAXBElement<ArrayOfApiEx> getExceptionData() {
        return exceptionData;
    }

    /**
     * Sets the value of the exceptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfApiEx }{@code >}
     *     
     */
    public void setExceptionData(JAXBElement<ArrayOfApiEx> value) {
        this.exceptionData = value;
    }

}
