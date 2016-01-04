/**
 * 
 */
package hu.infokristaly.homework.domain;

import javax.xml.bind.annotation.XmlType;

/**
 * @author pzoli
 *
 */
@XmlType(propOrder={"units"})
public class MNBCurrencyUnits {

    private Units units;

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }
}
