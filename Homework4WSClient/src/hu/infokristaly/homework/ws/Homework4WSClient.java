package hu.infokristaly.homework.ws;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.rmi.RemoteException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.rpc.ServiceException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

import hu.infokristaly.homework.domain.Day;
import hu.infokristaly.homework.domain.MNBCurrentExchangeRates;
import hu.infokristaly.homework.domain.Rate;
import hu.mnb.www.webservices.MNBArfolyamServiceSoap;
import hu.mnb.www.webservices.MNBArfolyamServiceSoapImplLocator;

public class Homework4WSClient { 

    public static void main(String[] args) {
        MNBArfolyamServiceSoapImplLocator locator = new MNBArfolyamServiceSoapImplLocator();
        try {

            MNBArfolyamServiceSoap soap = locator.getCustomBinding_MNBArfolyamServiceSoap();
            /*
            String info = soap.getInfo();
            System.out.println(info);
            String currencies = soap.getCurrencies();
            System.out.println(currencies);
            String units = soap.getCurrencyUnits("CHF");
            System.out.println(units);
            */            
            String rates="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+ (soap.getCurrentExchangeRates()); //toLowerCase()
            System.out.println(rates);


            Class<?>[] classes = {MNBCurrentExchangeRates.class, Day.class, Rate.class};
            JAXBContext jaxbContext = JAXBContext.newInstance(classes, null);

            XMLInputFactory xif = XMLInputFactory.newInstance();
            XMLStreamReader xsr = xif.createXMLStreamReader(new StringReader(rates));
            xsr = new MyStreamReaderDelegate(xsr);
            
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            MNBCurrentExchangeRates excRate = (MNBCurrentExchangeRates) unmarshaller.unmarshal(xsr);//new StringReader(rates)

            System.out.println(excRate);
            
            String rate = soap.getExchangeRates("2014-10-01", "2014-10-31", "USD");
            System.out.println(rate);
        } catch (ServiceException | RemoteException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private static class MyStreamReaderDelegate extends StreamReaderDelegate {
        
        public MyStreamReaderDelegate(XMLStreamReader xsr) {
            super(xsr);
        }
 
        @Override
        public String getAttributeLocalName(int index) {
            return super.getAttributeLocalName(index).toLowerCase();
        }
 
        @Override
        public String getLocalName() {
            return super.getLocalName().toLowerCase();
        }
 
    }
}
