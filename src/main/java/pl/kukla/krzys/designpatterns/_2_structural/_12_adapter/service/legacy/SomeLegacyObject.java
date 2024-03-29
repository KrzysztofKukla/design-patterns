package pl.kukla.krzys.designpatterns._2_structural._12_adapter.service.legacy;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author Krzysztof Kukla
 */
public class SomeLegacyObject {

    public int otherOperation(String stringValue) {
        return NumberUtils.isDigits(stringValue) ?
            Integer.parseInt(stringValue) : 100;
    }

}
