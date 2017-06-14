
package com.guness.CardRegistery.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common}ApiResponse">
 *       &lt;sequence>
 *         &lt;element name="Bank" type="{http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Bank}BankData" minOccurs="0"/>
 *         &lt;element name="Card" type="{http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card}CardData" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Customer}CustomerData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardServiceResponse", namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", propOrder = {
    "bank",
    "card",
    "customer"
})
public class CardServiceResponse
    extends ApiResponse
{

    @XmlElementRef(name = "Bank", namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", type = JAXBElement.class, required = false)
    protected JAXBElement<BankData> bank;
    @XmlElementRef(name = "Card", namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", type = JAXBElement.class, required = false)
    protected JAXBElement<CardData> card;
    @XmlElementRef(name = "Customer", namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerData> customer;

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankData }{@code >}
     *     
     */
    public JAXBElement<BankData> getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankData }{@code >}
     *     
     */
    public void setBank(JAXBElement<BankData> value) {
        this.bank = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardData }{@code >}
     *     
     */
    public JAXBElement<CardData> getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardData }{@code >}
     *     
     */
    public void setCard(JAXBElement<CardData> value) {
        this.card = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerData }{@code >}
     *     
     */
    public JAXBElement<CustomerData> getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerData }{@code >}
     *     
     */
    public void setCustomer(JAXBElement<CustomerData> value) {
        this.customer = value;
    }

}
