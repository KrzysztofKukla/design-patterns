package pl.kukla.krzys.designpatterns._2_structural._18_proxy.factory;

import pl.kukla.krzys.designpatterns._2_structural._18_proxy.Image;
import pl.kukla.krzys.designpatterns._2_structural._18_proxy.dynamic.ImageDynamicInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @author Krzysztof Kukla
 */
public class DynamicProxyImageFactory implements AbstractImageFactory {

    @Override
    public Image createImage(String name) {

        //here we dynamically generate poxy class
        //any method that is called on this object we call 'invoke' method from 'ImageDynamicInvocationHandler' class
        return (Image) Proxy.newProxyInstance(DynamicProxyImageFactory.class.getClassLoader(),
            new Class[]{Image.class}, new ImageDynamicInvocationHandler(name));
    }

}
