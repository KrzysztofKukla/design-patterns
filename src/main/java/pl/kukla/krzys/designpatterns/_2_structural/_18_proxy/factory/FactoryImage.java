package pl.kukla.krzys.designpatterns._2_structural._18_proxy.factory;

import pl.kukla.krzys.designpatterns._2_structural._18_proxy.Image;

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
