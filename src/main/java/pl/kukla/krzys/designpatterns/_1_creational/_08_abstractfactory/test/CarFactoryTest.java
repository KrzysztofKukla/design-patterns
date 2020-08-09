package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.CarProducer;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.domain.Car;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.factory.KiaFactory;

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
