package pl.kukla.krzys.designpatterns._2_structural._18_proxy.factory;

import pl.kukla.krzys.designpatterns._2_structural._18_proxy.BitmapImage;
import pl.kukla.krzys.designpatterns._2_structural._18_proxy.Image;

/**
 * @author Krzysztof Kukla
 */
public class BitmapImageFactory implements AbstractImageFactory {
    @Override
    public Image createImage(String name) {
        return new BitmapImage(name);
    }

}
