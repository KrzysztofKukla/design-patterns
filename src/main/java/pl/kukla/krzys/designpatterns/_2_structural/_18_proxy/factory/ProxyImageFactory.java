package pl.kukla.krzys.designpatterns._2_structural._18_proxy.factory;

import pl.kukla.krzys.designpatterns._2_structural._18_proxy.Image;
import pl.kukla.krzys.designpatterns._2_structural._18_proxy.ProxyImage;

/**
 * @author Krzysztof Kukla
 */
public class ProxyImageFactory implements AbstractImageFactory {
    @Override
    public Image createImage(String name) {
        return new ProxyImage(name);
    }

}
