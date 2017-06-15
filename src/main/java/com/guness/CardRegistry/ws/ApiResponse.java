/**
 * ApiResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guness.CardRegistry.ws;

public class ApiResponse  implements java.io.Serializable {
    private com.guness.CardRegistry.ws.ApiEx[] exceptionData;

    public ApiResponse() {
    }

    public ApiResponse(
           com.guness.CardRegistry.ws.ApiEx[] exceptionData) {
           this.exceptionData = exceptionData;
    }


    /**
     * Gets the exceptionData value for this ApiResponse.
     * 
     * @return exceptionData
     */
    public com.guness.CardRegistry.ws.ApiEx[] getExceptionData() {
        return exceptionData;
    }


    /**
     * Sets the exceptionData value for this ApiResponse.
     * 
     * @param exceptionData
     */
    public void setExceptionData(com.guness.CardRegistry.ws.ApiEx[] exceptionData) {
        this.exceptionData = exceptionData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiResponse)) return false;
        ApiResponse other = (ApiResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exceptionData==null && other.getExceptionData()==null) || 
             (this.exceptionData!=null &&
              java.util.Arrays.equals(this.exceptionData, other.getExceptionData())));
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
        if (getExceptionData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExceptionData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExceptionData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", "ApiResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", "ExceptionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", "ApiEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", "ApiEx"));
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
