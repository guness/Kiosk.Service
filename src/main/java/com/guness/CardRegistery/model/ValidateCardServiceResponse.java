
package com.guness.CardRegistery.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateCardServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateCardServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common}ApiResponse">
 *       &lt;sequence>
 *         &lt;element name="CardData" type="{http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card}CardServiceResponse" minOccurs="0"/>
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCardServiceResponse", namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", propOrder = {
    "cardData",
    "isValid"
})
public class ValidateCardServiceResponse
    extends ApiResponse
{

    @XmlElementRef(name = "CardData", namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", type = JAXBElement.class, required = false)
    protected JAXBElement<CardServiceResponse> cardData;
    @XmlElement(name = "IsValid")
    protected Boolean isValid;

    /**
     * Gets the value of the cardData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardServiceResponse }{@code >}
     *     
     */
    public JAXBElement<CardServiceResponse> getCardData() {
        return cardData;
    }

    /**
     * Sets the value of the cardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardServiceResponse }{@code >}
     *     
     */
    public void setCardData(JAXBElement<CardServiceResponse> value) {
        this.cardData = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
    }

}
