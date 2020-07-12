package pl.kukla.krzys.designpatterns.structural.proxy.factory;

import pl.kukla.krzys.designpatterns.structural.proxy.Image;

/**
 * @author Krzysztof Kukla
 */
public class FactoryImage {
    private FactoryImage() {
    }

    public static Image createImage(AbstractImageFactory abstractImageFactory, String name) {
        return abstractImageFactory.createImage(name);
    }

}
