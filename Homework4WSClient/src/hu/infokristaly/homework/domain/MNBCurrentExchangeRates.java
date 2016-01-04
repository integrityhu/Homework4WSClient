/**
 * 
 */
package hu.infokristaly.homework.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author pzoli
 *
 */
@XmlRootElement(name="mnbcurrentexchangerates")
@XmlType(name="MNBCurrentExchangeRates", propOrder={"day"})
public class MNBCurrentExchangeRates {
    
    public MNBCurrentExchangeRates() {
    }

    //@XmlElement
    public Day day;
    
}
