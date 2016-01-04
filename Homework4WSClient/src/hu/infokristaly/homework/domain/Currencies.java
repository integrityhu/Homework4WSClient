/**
 * 
 */
package hu.infokristaly.homework.domain;

import javax.xml.bind.annotation.XmlType;

/**
 * @author pzoli
 *
 */
@XmlType(propOrder={"curr"})
public class Currencies {

    private String[] curr;

    public String[] getCurr() {
        return curr;
    }

    public void setCurr(String[] curr) {
        this.curr = curr;
    }
}
