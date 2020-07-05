package pl.kukla.krzys.designpatterns.creational.abstractfactory.factory;

import pl.kukla.krzys.designpatterns.creational.abstractfactory.domain.Car;
import pl.kukla.krzys.designpatterns.creational.abstractfactory.domain.Kia;

/**
 * @author Krzysztof Kukla
 */
public class KiaFactory implements CarFactory {
    @Override
    public Car build() {
        return new Kia();
    }

}
