/**
 * CardApiLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guness.CardRegistry.ws;

public class CardApiLocator extends org.apache.axis.client.Service implements com.guness.CardRegistry.ws.CardApi {

    public CardApiLocator() {
    }


    public CardApiLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CardApiLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ICardApi
    private java.lang.String BasicHttpBinding_ICardApi_address = "http://52.28.91.8/CardApi.svc";

    public java.lang.String getBasicHttpBinding_ICardApiAddress() {
        return BasicHttpBinding_ICardApi_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ICardApiWSDDServiceName = "BasicHttpBinding_ICardApi";

    public java.lang.String getBasicHttpBinding_ICardApiWSDDServiceName() {
        return BasicHttpBinding_ICardApiWSDDServiceName;
    }

    public void setBasicHttpBinding_ICardApiWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ICardApiWSDDServiceName = name;
    }

    public com.guness.CardRegistry.ws.ICardApi getBasicHttpBinding_ICardApi() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ICardApi_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ICardApi(endpoint);
    }

    public com.guness.CardRegistry.ws.ICardApi getBasicHttpBinding_ICardApi(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guness.CardRegistry.ws.BasicHttpBinding_ICardApiStub _stub = new com.guness.CardRegistry.ws.BasicHttpBinding_ICardApiStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ICardApiWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ICardApiEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ICardApi_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guness.CardRegistry.ws.ICardApi.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guness.CardRegistry.ws.BasicHttpBinding_ICardApiStub _stub = new com.guness.CardRegistry.ws.BasicHttpBinding_ICardApiStub(new java.net.URL(BasicHttpBinding_ICardApi_address), this);
                _stub.setPortName(getBasicHttpBinding_ICardApiWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_ICardApi".equals(inputPortName)) {
            return getBasicHttpBinding_ICardApi();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "CardApi");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_ICardApi"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ICardApi".equals(portName)) {
            setBasicHttpBinding_ICardApiEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
