package pl.kukla.krzys.designpatterns._2_structural._12_adapter.service.legacy;

import pl.kukla.krzys.designpatterns._2_structural._12_adapter.service.MyService;

/**
 * @author Krzysztof Kukla
 */
public class LegacyFunctionalityAdapter implements MyService {

    private SomeLegacyObject someLegacyObject;

    public LegacyFunctionalityAdapter(SomeLegacyObject someLegacyObject) {
        this.someLegacyObject = someLegacyObject;
    }

    @Override
    public Integer compute(int value) {
        int additionalResult = someLegacyObject.otherOperation("200");
        return value + additionalResult;
    }

}
