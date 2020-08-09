package pl.kukla.krzys.designpatterns._2_structural._18_proxy;

import javafx.geometry.Point2D;

public interface Image {

    Point2D getLocation();

    void setLocation(Point2D location);

    void render();

}
