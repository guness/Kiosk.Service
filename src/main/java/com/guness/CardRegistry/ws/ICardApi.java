/**
 * ICardApi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.guness.CardRegistry.ws;

public interface ICardApi extends java.rmi.Remote {
    public com.guness.CardRegistry.ws.RetrieveCardDataResponse retrieveCardData(com.guness.CardRegistry.ws.RetrieveCardData parameters) throws java.rmi.RemoteException;
    public com.guness.CardRegistry.ws.ValidateCardDataResponse validateCardData(com.guness.CardRegistry.ws.ValidateCardData parameters) throws java.rmi.RemoteException;
}
