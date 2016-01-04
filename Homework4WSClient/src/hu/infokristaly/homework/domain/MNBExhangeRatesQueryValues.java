/**
 * 
 */
package hu.infokristaly.homework.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author pzoli
 *
 */

@XmlRootElement
@XmlType(propOrder = { "firstDate", "lastDate", "currencies" })
public class MNBExhangeRatesQueryValues {

    private String firstDate;
    private String lastDate;
    private Currencies currencies;
    
    public Currencies getCurrencies() {
        return currencies;
    }
    
    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }
    
    public String getLastDate() {
        return lastDate;
    }
    
    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }
    
    public String getFirstDate() {
        return firstDate;
    }
    
    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }
    
}
