package pl.kukla.krzys.designpatterns.structural.proxy;

import javafx.geometry.Point2D;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Krzysztof Kukla
 */
@Getter
@Setter
public class BitmapImage implements Image {
    private final String name;
    private Point2D location;

    public BitmapImage(String name) {
        System.out.println("Loaded from disk " + name);
        this.name = name;
    }

    @Override
    public void setLocation(Point2D location) {

    }

    @Override
    public void render() {
        System.out.println("Rendered " + name);
    }

}
