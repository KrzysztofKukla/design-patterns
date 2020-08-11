package pl.kukla.krzys.designpatterns._2_structural._18_proxy;

import javafx.geometry.Point2D;

/**
 * Similar to decorator
 * for Decorator we are adding additional functionality
 * for Proxy we wrapper object with any additional feature like lazy loading, access control etc.
 * Proxy is placeholder ( symbol zastepczy ), surrogate ( zastępstwo ) for real object
 * Proxy work around ( obchodzi ) real object
 * There are many reasons to use proxy - the most commons are
 * - lazy loading,
 * - access control
 * - auditing
 * - protection proxy - security - control access to original's operations - control which operation can be called on the real object and when
 * - remote proxy - provides local representation of remote object
 * - virtual proxy - delay of construction of object ( performance issue - construction is very expensive and takes long time ) until this is
 * really necessary
 * Client is completely unaware of existing of proxy, everything works transparently
 * Client bases on the same interface which can be proxy
 * examples of using proxy in real life:
 * - Lazy loading collection by Hibernate
 * - Spring feature like transaction management, caching, AOP ( Aspects ) support
 * - Spring Security
 * <p>
 * to provide proxy to the Client instead real object we use ProxyFactory
 * pay attention to the performance cost of using proxy and synchronization if our base object is Thread Safe
 * Synchronization for Proxy is not automatically even if our base object is synchronized
 * Decorator needs access to real object vs Proxy does not all the time
 */
public class ProxyImage implements Image {

    private final String name;

    private Point2D location;

    //use this object in proxy
    private Image image;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public Point2D getLocation() {
        return image != null ?
            image.getLocation() : this.location;
    }

    @Override
    public void setLocation(Point2D location) {
        if (image != null) {
            image.setLocation(location);
        } else {
            this.location = location;
        }
    }

    @Override
    public void render() {
        //here we create real delayed Image object only when it is really necessary
        if (image == null) {
            image = new BitmapImage(name);
            if (location != null) {
                image.setLocation(location);
            }
        }
        //then call default render() method
        image.render();

    }

}
