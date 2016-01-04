package hu.mnb.www.webservices;

public class MNBArfolyamServiceSoapProxy implements hu.mnb.www.webservices.MNBArfolyamServiceSoap {
  private String _endpoint = null;
  private hu.mnb.www.webservices.MNBArfolyamServiceSoap mNBArfolyamServiceSoap = null;
  
  public MNBArfolyamServiceSoapProxy() {
    _initMNBArfolyamServiceSoapProxy();
  }
  
  public MNBArfolyamServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initMNBArfolyamServiceSoapProxy();
  }
  
  private void _initMNBArfolyamServiceSoapProxy() {
    try {
      mNBArfolyamServiceSoap = (new hu.mnb.www.webservices.MNBArfolyamServiceSoapImplLocator()).getCustomBinding_MNBArfolyamServiceSoap();
      if (mNBArfolyamServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mNBArfolyamServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mNBArfolyamServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mNBArfolyamServiceSoap != null)
      ((javax.xml.rpc.Stub)mNBArfolyamServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public hu.mnb.www.webservices.MNBArfolyamServiceSoap getMNBArfolyamServiceSoap() {
    if (mNBArfolyamServiceSoap == null)
      _initMNBArfolyamServiceSoapProxy();
    return mNBArfolyamServiceSoap;
  }
  
  public java.lang.String getCurrencies() throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetCurrencies_StringFault_FaultMessage{
    if (mNBArfolyamServiceSoap == null)
      _initMNBArfolyamServiceSoapProxy();
    return mNBArfolyamServiceSoap.getCurrencies();
  }
  
  public java.lang.String getCurrencyUnits(java.lang.String currencyNames) throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetCurrencyUnits_StringFault_FaultMessage{
    if (mNBArfolyamServiceSoap == null)
      _initMNBArfolyamServiceSoapProxy();
    return mNBArfolyamServiceSoap.getCurrencyUnits(currencyNames);
  }
  
  public java.lang.String getCurrentExchangeRates() throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetCurrentExchangeRates_StringFault_FaultMessage{
    if (mNBArfolyamServiceSoap == null)
      _initMNBArfolyamServiceSoapProxy();
    return mNBArfolyamServiceSoap.getCurrentExchangeRates();
  }
  
  public java.lang.String getDateInterval() throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetDateInterval_StringFault_FaultMessage{
    if (mNBArfolyamServiceSoap == null)
      _initMNBArfolyamServiceSoapProxy();
    return mNBArfolyamServiceSoap.getDateInterval();
  }
  
  public java.lang.String getExchangeRates(java.lang.String startDate, java.lang.String endDate, java.lang.String currencyNames) throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetExchangeRates_StringFault_FaultMessage{
    if (mNBArfolyamServiceSoap == null)
      _initMNBArfolyamServiceSoapProxy();
    return mNBArfolyamServiceSoap.getExchangeRates(startDate, endDate, currencyNames);
  }
  
  public java.lang.String getInfo() throws java.rmi.RemoteException, hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetInfo_StringFault_FaultMessage{
    if (mNBArfolyamServiceSoap == null)
      _initMNBArfolyamServiceSoapProxy();
    return mNBArfolyamServiceSoap.getInfo();
  }
  
  
}