package pl.kukla.krzys.designpatterns.structural.adapter.legacy;

import pl.kukla.krzys.designpatterns.structural.adapter.MyService;

/**
 * @author Krzysztof Kukla
 */
public class LegacyClassAdapter implements MyService {

    private LegacyClass legacyClass;

    public LegacyClassAdapter(LegacyClass legacyClass) {
        this.legacyClass = legacyClass;
    }

    @Override
    public Integer compute(int value) {
        int additionalResult = legacyClass.otherOperation("200");
        return value + additionalResult;
    }

}