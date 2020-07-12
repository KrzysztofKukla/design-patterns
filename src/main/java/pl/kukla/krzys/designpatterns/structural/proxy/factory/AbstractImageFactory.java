package pl.kukla.krzys.designpatterns.structural.proxy.factory;

import pl.kukla.krzys.designpatterns.structural.proxy.Image;

/**
 * @author Krzysztof Kukla
 */
public interface AbstractImageFactory {

    Image createImage(String name);

}
