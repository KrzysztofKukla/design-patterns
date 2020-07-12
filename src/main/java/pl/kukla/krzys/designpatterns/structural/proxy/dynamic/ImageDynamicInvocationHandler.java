package pl.kukla.krzys.designpatterns.structural.proxy.dynamic;

import javafx.geometry.Point2D;
import pl.kukla.krzys.designpatterns.structural.proxy.BitmapImage;
import pl.kukla.krzys.designpatterns.structural.proxy.Image;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Java Dynamic Proxy will create proxy for us
 * Dynamic Proxy for Image interface which allows to load BitmapImage object only when it is really necessary
 * Dynamic Proxy class will be created in Runtime
 */
public class ImageDynamicInvocationHandler implements InvocationHandler {

    private final String name;
    private Point2D location;

    private Image image;

    private static final Method getLocation;
    private static final Method setLocation;
    private static final Method render;

    //cache methods for later comparision
    static {
        try {
            getLocation = Image.class.getMethod("getLocation");
            setLocation = Image.class.getMethod("setLocation", Point2D.class);
            render = Image.class.getMethod("render");
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }

    public ImageDynamicInvocationHandler(String name) {
        this.name = name;
    }

    //this method will be call when somebody calls any method on dynamic execute proxy im. getLocation(), setLocation(), render()
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //first we need to check which method was called on the proxy and then decide what to do
        if (method.equals(getLocation)) {
            return handleGetLocation();
        }
        if (method.equals(setLocation)) {
            //args hold parameters in this case for setLocation method
            //args[0] will hold Point2D type
            return handleSetLocation(args);
        }
        if (method.equals(render)) {
            return handleRender();
        }

        Method setLocationMethod = Image.class.getMethod("setLocation", Point2D.class);

        if (setLocationMethod.equals(method)) {
            Point2D point2D = (Point2D) args[0];
            System.out.println("Calls from DynamicInvocationHandler " + point2D);
        }
        return null;
    }

    private Object handleRender() {
        if (image == null) {
            image = new BitmapImage(name);
            if (location != null) {
                image.setLocation(location);
            }
        }
        image.render();
        return null;
    }

    private Object handleSetLocation(Object[] args) {
        if (image != null) {
            image.setLocation((Point2D) args[0]);
        } else {
            location = (Point2D) args[0];
        }
        return null;
    }

    private Point2D handleGetLocation() {
        return image != null ?
            image.getLocation() : this.location;
    }

}
