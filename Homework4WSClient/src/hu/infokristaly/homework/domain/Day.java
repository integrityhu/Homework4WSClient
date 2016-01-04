/**
 * 
 */
package hu.infokristaly.homework.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author pzoli
 *
 */
@XmlType(name="day",propOrder={"rate"})
public class Day {
    public Day(){
        
    }
    
    @XmlElement
    public Rate[] rate;

    @XmlAttribute(name="date")
    public String date;
}
