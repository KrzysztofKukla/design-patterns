package pl.kukla.krzys.designpatterns.structural.adapter.legacy;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author Krzysztof Kukla
 */
public class LegacyClass {

    public int otherOperation(String stringValue) {
        return NumberUtils.isDigits(stringValue) ?
            Integer.parseInt(stringValue) : 100;
    }

}
