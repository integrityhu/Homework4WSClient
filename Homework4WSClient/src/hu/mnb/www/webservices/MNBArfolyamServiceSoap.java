/**
 * MNBArfolyamServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package hu.mnb.www.webservices;

public interface MNBArfolyamServiceSoap extends java.rmi.Remote {
    public java.lang.String getCurrencies() throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetCurrencies_StringFault_FaultMessage;
    public java.lang.String getCurrencyUnits(java.lang.String currencyNames) throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetCurrencyUnits_StringFault_FaultMessage;
    public java.lang.String getCurrentExchangeRates() throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetCurrentExchangeRates_StringFault_FaultMessage;
    public java.lang.String getDateInterval() throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetDateInterval_StringFault_FaultMessage;
    public java.lang.String getExchangeRates(java.lang.String startDate, java.lang.String endDate, java.lang.String currencyNames) throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetExchangeRates_StringFault_FaultMessage;
    public java.lang.String getInfo() throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetInfo_StringFault_FaultMessage;
}
