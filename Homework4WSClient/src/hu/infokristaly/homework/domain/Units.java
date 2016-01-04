/**
 * 
 */
package hu.infokristaly.homework.domain;

import javax.xml.bind.annotation.XmlType;

/**
 * @author pzoli
 *
 */
@XmlType(propOrder={"unit"})
public class Units {
    private Unit[] unit;

    public Unit[] getUnit() {
        return unit;
    }

    public void setUnit(Unit[] unit) {
        this.unit = unit;
    }
}
