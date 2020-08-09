package pl.kukla.krzys.designpatterns._1_creational._05_simple_factory.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._1_creational._05_simple_factory.DeviceFactory;
import pl.kukla.krzys.designpatterns._1_creational._05_simple_factory.domain.Computer;
import pl.kukla.krzys.designpatterns._1_creational._05_simple_factory.domain.Device;
import pl.kukla.krzys.designpatterns._1_creational._05_simple_factory.domain.MobilePhone;

/**
 * @author Krzysztof Kukla
 */
public class DeviceFactoryTest {
    @Test
    void mobilePhoneTest() throws Exception {
        Device device = DeviceFactory.buildDevice("phone");
        Assertions.assertThat(device).isInstanceOf(MobilePhone.class);
    }

    @Test
    void computerTest() throws Exception {
        Device device = DeviceFactory.buildDevice("com");
        Assertions.assertThat(device).isInstanceOf(Computer.class);
    }

    @Test
    void invalidTypeTest() throws Exception {
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> DeviceFactory.buildDevice("afffff"));
    }

}
