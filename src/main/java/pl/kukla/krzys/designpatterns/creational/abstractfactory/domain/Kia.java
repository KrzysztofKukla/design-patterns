package pl.kukla.krzys.designpatterns.creational.abstractfactory.domain;

/**
 * @author Krzysztof Kukla
 */
public class Kia implements Car {
    @Override
    public void drive() {
        System.out.println("Kia");
    }

}
