/**
 * RetrieveCardDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guness.CardRegistry.ws;

public class RetrieveCardDataResponse  implements java.io.Serializable {
    private com.guness.CardRegistry.ws.CardServiceResponse retrieveCardDataResult;

    public RetrieveCardDataResponse() {
    }

    public RetrieveCardDataResponse(
           com.guness.CardRegistry.ws.CardServiceResponse retrieveCardDataResult) {
           this.retrieveCardDataResult = retrieveCardDataResult;
    }


    /**
     * Gets the retrieveCardDataResult value for this RetrieveCardDataResponse.
     * 
     * @return retrieveCardDataResult
     */
    public com.guness.CardRegistry.ws.CardServiceResponse getRetrieveCardDataResult() {
        return retrieveCardDataResult;
    }


    /**
     * Sets the retrieveCardDataResult value for this RetrieveCardDataResponse.
     * 
     * @param retrieveCardDataResult
     */
    public void setRetrieveCardDataResult(com.guness.CardRegistry.ws.CardServiceResponse retrieveCardDataResult) {
        this.retrieveCardDataResult = retrieveCardDataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveCardDataResponse)) return false;
        RetrieveCardDataResponse other = (RetrieveCardDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retrieveCardDataResult==null && other.getRetrieveCardDataResult()==null) || 
             (this.retrieveCardDataResult!=null &&
              this.retrieveCardDataResult.equals(other.getRetrieveCardDataResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRetrieveCardDataResult() != null) {
            _hashCode += getRetrieveCardDataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveCardDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RetrieveCardDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveCardDataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RetrieveCardDataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "CardServiceResponse"));
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
