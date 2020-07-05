package pl.kukla.krzys.designpatterns.creational.abstractfactory.factory;

import pl.kukla.krzys.designpatterns.creational.abstractfactory.domain.Car;
import pl.kukla.krzys.designpatterns.creational.abstractfactory.domain.Mazda;

/**
 * @author Krzysztof Kukla
 */
public class MazdaFactory implements CarFactory {
    @Override
    public Car build() {
        return new Mazda();
    }

}
