package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car;

import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.domain.Car;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.factory.CarFactory;

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
