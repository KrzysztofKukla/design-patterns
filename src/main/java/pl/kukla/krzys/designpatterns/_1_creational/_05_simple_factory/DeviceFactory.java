package pl.kukla.krzys.designpatterns._1_creational._05_simple_factory;

import pl.kukla.krzys.designpatterns._1_creational._05_simple_factory.domain.Computer;
import pl.kukla.krzys.designpatterns._1_creational._05_simple_factory.domain.Device;
import pl.kukla.krzys.designpatterns._1_creational._05_simple_factory.domain.MobilePhone;

/**
 * @author Krzysztof Kukla
 */
public class DeviceFactory {
    private DeviceFactory() {
    }

    public static Device buildDevice(String type) {
        switch (type) {
            case "phone":
                return new MobilePhone();
            case "com":
                return new Computer();
            default:
                throw new IllegalArgumentException("Specified device does not exist");
        }
    }

}
