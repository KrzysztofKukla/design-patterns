package pl.kukla.krzys.designpatterns.structural.proxy.factory;

import pl.kukla.krzys.designpatterns.structural.proxy.Image;
import pl.kukla.krzys.designpatterns.structural.proxy.ProxyImage;

/**
 * @author Krzysztof Kukla
 */
public class ProxyImageFactory implements AbstractImageFactory {
    @Override
    public Image createImage(String name) {
        return new ProxyImage(name);
    }

}
