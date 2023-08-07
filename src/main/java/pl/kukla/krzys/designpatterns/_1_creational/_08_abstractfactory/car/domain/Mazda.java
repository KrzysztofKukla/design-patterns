package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.car.domain;

/**
 * @author Krzysztof Kukla
 */
public class Mazda implements Car {
    @Override
    public void drive() {
        System.out.println("Mazda");
    }

}
