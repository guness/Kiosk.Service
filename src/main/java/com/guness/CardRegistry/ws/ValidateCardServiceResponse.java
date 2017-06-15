/**
 * ValidateCardServiceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guness.CardRegistry.ws;

public class ValidateCardServiceResponse  extends com.guness.CardRegistry.ws.ApiResponse  implements java.io.Serializable {
    private com.guness.CardRegistry.ws.CardServiceResponse cardData;

    private java.lang.Boolean isValid;

    public ValidateCardServiceResponse() {
    }

    public ValidateCardServiceResponse(
           com.guness.CardRegistry.ws.ApiEx[] exceptionData,
           com.guness.CardRegistry.ws.CardServiceResponse cardData,
           java.lang.Boolean isValid) {
        super(
            exceptionData);
        this.cardData = cardData;
        this.isValid = isValid;
    }


    /**
     * Gets the cardData value for this ValidateCardServiceResponse.
     * 
     * @return cardData
     */
    public com.guness.CardRegistry.ws.CardServiceResponse getCardData() {
        return cardData;
    }


    /**
     * Sets the cardData value for this ValidateCardServiceResponse.
     * 
     * @param cardData
     */
    public void setCardData(com.guness.CardRegistry.ws.CardServiceResponse cardData) {
        this.cardData = cardData;
    }


    /**
     * Gets the isValid value for this ValidateCardServiceResponse.
     * 
     * @return isValid
     */
    public java.lang.Boolean getIsValid() {
        return isValid;
    }


    /**
     * Sets the isValid value for this ValidateCardServiceResponse.
     * 
     * @param isValid
     */
    public void setIsValid(java.lang.Boolean isValid) {
        this.isValid = isValid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateCardServiceResponse)) return false;
        ValidateCardServiceResponse other = (ValidateCardServiceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardData==null && other.getCardData()==null) || 
             (this.cardData!=null &&
              this.cardData.equals(other.getCardData()))) &&
            ((this.isValid==null && other.getIsValid()==null) || 
             (this.isValid!=null &&
              this.isValid.equals(other.getIsValid())));
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
        if (getCardData() != null) {
            _hashCode += getCardData().hashCode();
        }
        if (getIsValid() != null) {
            _hashCode += getIsValid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateCardServiceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "ValidateCardServiceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "CardData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "CardServiceResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "IsValid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
