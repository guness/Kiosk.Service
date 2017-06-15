/**
 * CardServiceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guness.CardRegistry.ws;

public class CardServiceResponse  extends com.guness.CardRegistry.ws.ApiResponse  implements java.io.Serializable {
    private com.guness.CardRegistry.ws.BankData bank;

    private com.guness.CardRegistry.ws.CardData card;

    private com.guness.CardRegistry.ws.CustomerData customer;

    public CardServiceResponse() {
    }

    public CardServiceResponse(
           com.guness.CardRegistry.ws.ApiEx[] exceptionData,
           com.guness.CardRegistry.ws.BankData bank,
           com.guness.CardRegistry.ws.CardData card,
           com.guness.CardRegistry.ws.CustomerData customer) {
        super(
            exceptionData);
        this.bank = bank;
        this.card = card;
        this.customer = customer;
    }


    /**
     * Gets the bank value for this CardServiceResponse.
     * 
     * @return bank
     */
    public com.guness.CardRegistry.ws.BankData getBank() {
        return bank;
    }


    /**
     * Sets the bank value for this CardServiceResponse.
     * 
     * @param bank
     */
    public void setBank(com.guness.CardRegistry.ws.BankData bank) {
        this.bank = bank;
    }


    /**
     * Gets the card value for this CardServiceResponse.
     * 
     * @return card
     */
    public com.guness.CardRegistry.ws.CardData getCard() {
        return card;
    }


    /**
     * Sets the card value for this CardServiceResponse.
     * 
     * @param card
     */
    public void setCard(com.guness.CardRegistry.ws.CardData card) {
        this.card = card;
    }


    /**
     * Gets the customer value for this CardServiceResponse.
     * 
     * @return customer
     */
    public com.guness.CardRegistry.ws.CustomerData getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this CardServiceResponse.
     * 
     * @param customer
     */
    public void setCustomer(com.guness.CardRegistry.ws.CustomerData customer) {
        this.customer = customer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardServiceResponse)) return false;
        CardServiceResponse other = (CardServiceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bank==null && other.getBank()==null) || 
             (this.bank!=null &&
              this.bank.equals(other.getBank()))) &&
            ((this.card==null && other.getCard()==null) || 
             (this.card!=null &&
              this.card.equals(other.getCard()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBank() != null) {
            _hashCode += getBank().hashCode();
        }
        if (getCard() != null) {
            _hashCode += getCard().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardServiceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "CardServiceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "Bank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Bank", "BankData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "Card"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "CardData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Customer", "CustomerData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
