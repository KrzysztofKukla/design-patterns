package pl.kukla.krzys.designpatterns._1_creational._10_objectpool;

import javafx.geometry.Point2D;

/**
 * @author Krzysztof Kukla
 */
public interface Image extends Poolable {
    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);

}
