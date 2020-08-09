package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.factory;

import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.domain.Car;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.domain.Mazda;

/**
 * @author Krzysztof Kukla
 */
public class MazdaFactory implements CarFactory {
    @Override
    public Car build() {
        return new Mazda();
    }

}
