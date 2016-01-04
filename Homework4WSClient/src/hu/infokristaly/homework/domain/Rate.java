/**
 * 
 */
package hu.infokristaly.homework.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author pzoli
 *
 */
@XmlType(name="rate")
public class Rate {
    public Rate() {
        
    }
    
    @XmlAttribute(name="curr")
    public String curr;
    
    @XmlAttribute(name="unit")
    public String unit;

    @XmlValue
    public String value;

}
