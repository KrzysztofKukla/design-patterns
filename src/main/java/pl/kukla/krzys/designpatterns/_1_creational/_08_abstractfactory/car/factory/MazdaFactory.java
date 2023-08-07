package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.factory;

import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.domain.Car;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.domain.Mazda;

/**
 * @author Krzysztof Kukla
 */
public class MazdaFactory implements CarFactory {
    @Override
    public Car build() {
        return new Mazda();
    }

}
