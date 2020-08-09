package pl.kukla.krzys.designpatterns._1_creational._04_builder.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._1_creational._04_builder.Person;

/**
 * @author Krzysztof Kukla
 */
public class PersonBuilderTest {

    @Test
    void builder() throws Exception {
        Person person = Person.builder()
            .name("aaa")
            .age(22)
            .build();

        System.out.println(person);
    }

}
