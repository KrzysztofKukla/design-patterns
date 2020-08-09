package pl.kukla.krzys.designpatterns._1_creational._07_prototype.test;

import javafx.geometry.Point3D;
import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._1_creational._07_prototype.Swordsman;

/**
 * @author Krzysztof Kukla
 */
public class PrototypeTest {

    @Test
    void prototype() throws Exception {
        Swordsman swordsman1 = new Swordsman();
        swordsman1.move(new Point3D(-10, 0, 0), 20);
        swordsman1.attack();

        System.out.println(swordsman1);

        Swordsman swordsman2 = (Swordsman) swordsman1.clone();
        System.out.println("Cloned Swordsman-> " + swordsman2);

    }

}
