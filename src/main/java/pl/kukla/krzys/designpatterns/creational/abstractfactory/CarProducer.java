package pl.kukla.krzys.designpatterns.creational.abstractfactory;

import pl.kukla.krzys.designpatterns.creational.abstractfactory.domain.Car;
import pl.kukla.krzys.designpatterns.creational.abstractfactory.factory.CarFactory;

/**
 * @author Krzysztof Kukla
 */
public class CarProducer {

    private CarProducer() {
    }

    public static Car createCar(CarFactory carFactory) {
        return carFactory.build();
    }

}
