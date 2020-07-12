package pl.kukla.krzys.designpatterns.structural.proxy.factory;

import pl.kukla.krzys.designpatterns.structural.proxy.BitmapImage;
import pl.kukla.krzys.designpatterns.structural.proxy.Image;

/**
 * @author Krzysztof Kukla
 */
public class BitmapImageFactory implements AbstractImageFactory {
    @Override
    public Image createImage(String name) {
        return new BitmapImage(name);
    }

}
