package pl.kukla.krzys.designpatterns.creational.abstractfactory.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns.creational.abstractfactory.CarProducer;
import pl.kukla.krzys.designpatterns.creational.abstractfactory.domain.Car;
import pl.kukla.krzys.designpatterns.creational.abstractfactory.factory.KiaFactory;

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
