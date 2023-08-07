package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.factory;

import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.domain.Car;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.domain.Kia;

/**
 * @author Krzysztof Kukla
 */
public class KiaFactory implements CarFactory {
    @Override
    public Car build() {
        return new Kia();
    }

}
