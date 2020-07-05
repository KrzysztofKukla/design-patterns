package pl.kukla.krzys.designpatterns.structural.adapter;

/**
 * @author Krzysztof Kukla
 */
public class MyServiceImpl implements MyService {
    @Override
    public Integer compute(int value) {
        return 10 * value;
    }

}
