package pl.kukla.krzys.designpatterns._2_structural._12_adapter;

/**
 * @author Krzysztof Kukla
 */
public class MyServiceImpl implements MyService {
    @Override
    public Integer compute(int value) {
        return 10 * value;
    }

}
