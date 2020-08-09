package pl.kukla.krzys.designpatterns._2_structural._18_proxy.factory;

import pl.kukla.krzys.designpatterns._2_structural._18_proxy.Image;

/**
 * @author Krzysztof Kukla
 */
public interface AbstractImageFactory {

    Image createImage(String name);

}
