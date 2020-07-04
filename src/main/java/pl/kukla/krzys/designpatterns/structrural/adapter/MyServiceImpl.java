package pl.kukla.krzys.designpatterns.structrural.adapter;

/**
 * @author Krzysztof Kukla
 */
public class MyServiceImpl implements MyService {
    @Override
    public Integer compute(int value) {
        return 10*value;
    }

}
