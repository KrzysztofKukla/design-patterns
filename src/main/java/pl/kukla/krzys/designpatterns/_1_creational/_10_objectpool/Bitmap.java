package pl.kukla.krzys.designpatterns._1_creational._10_objectpool;

import javafx.geometry.Point2D;

//we want to pool this object, because every time when we want to create Bitmap object is going to trigger FileIO
// and it going to block and memory allocation and store all file content
// so we don't want to do all this costly operations each time
public class Bitmap implements Image {
    private Point2D location;
    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing name " + name + "@" + location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap is reset");
    }

}
