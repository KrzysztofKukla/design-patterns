package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory;

import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.domain.Car;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.factory.CarFactory;

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
