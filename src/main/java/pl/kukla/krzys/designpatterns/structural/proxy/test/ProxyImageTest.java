package pl.kukla.krzys.designpatterns.structural.proxy.test;

import javafx.geometry.Point2D;
import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns.structural.proxy.Image;
import pl.kukla.krzys.designpatterns.structural.proxy.factory.DynamicProxyImageFactory;
import pl.kukla.krzys.designpatterns.structural.proxy.factory.FactoryImage;
import pl.kukla.krzys.designpatterns.structural.proxy.factory.ProxyImageFactory;

/**
 * @author Krzysztof Kukla
 */
public class ProxyImageTest {

    private Image image;

    @Test
    void delayedCreationObjectByProxy() throws Exception {
        image = FactoryImage.createImage(new ProxyImageFactory(), "A1.bmp");
        image.setLocation(new Point2D(10, 10));
        System.out.println("Image location " + image.getLocation());
        System.out.println("rendering image now...");

        image.render();
    }

    @Test
    void dynamicProxy() throws Exception {
        image = FactoryImage.createImage(new DynamicProxyImageFactory(), "");

        //this proxy 'setLocation' method is call from ImageDynamicInvocationHandler
        image.setLocation(new Point2D(-10, 0));

        image.render();
    }

}
