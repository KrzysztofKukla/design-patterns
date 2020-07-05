package pl.kukla.krzys.designpatterns.creational.builder.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns.creational.builder.Person;

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
