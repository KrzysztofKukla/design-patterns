package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.CarProducer;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.domain.Car;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.factory.KiaFactory;

/**
 * @author Krzysztof Kukla
 */
public class CarFactoryTest {

    @Test
    void kiaFactory() throws Exception {
        Car car = CarProducer.createCar(new KiaFactory());
        car.drive();
    }

}
