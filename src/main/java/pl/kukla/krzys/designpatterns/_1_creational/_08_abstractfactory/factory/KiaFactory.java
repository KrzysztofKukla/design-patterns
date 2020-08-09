package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.factory;

import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.domain.Car;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.domain.Kia;

/**
 * @author Krzysztof Kukla
 */
public class KiaFactory implements CarFactory {
    @Override
    public Car build() {
        return new Kia();
    }

}
