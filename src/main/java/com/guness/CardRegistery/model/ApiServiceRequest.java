
package com.guness.CardRegistery.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiServiceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Context" type="{http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Common}ApiContext"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiServiceRequest", namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Common", propOrder = {
    "context"
})
@XmlSeeAlso({
    ValidateCardDataServiceRequest.class,
    RetrieveCardByAccountServiceRequest.class
})
public class ApiServiceRequest {

    @XmlElement(name = "Context", required = true, nillable = true)
    protected ApiContext context;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ApiContext }
     *     
     */
    public ApiContext getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiContext }
     *     
     */
    public void setContext(ApiContext value) {
        this.context = value;
    }

}
