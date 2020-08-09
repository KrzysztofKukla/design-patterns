package pl.kukla.krzys.designpatterns._1_creational._07_prototype;

import javafx.geometry.Point3D;
import lombok.Getter;

/**
 * we can use Prototype pattern when we have complex Object ( muliple fields ) and creating this object is costly operation ( performance,
 * calculation, external
 * resources etc. ) which are not in our control
 * and to create multiple instances we use single object or existing object as our prototype
 * Prototype allows to make copies of existing instances and saves us from creating these instances from scratch
 * in clone operation we done deep copy or shallow ( plytki ) copy
 * in shallow we only simple copy objects properties into new object
 * Shallow copy if we have immutable object
 * in deep copy we will create all objects that are needed by our Prototype object
 * default clone method in Object class always perform shallow copy
 * if objects in Class are mutable then we need deep copy of all mutable objects
 * after cloned always reset state of object to started state
 * indicate Class as Cloneable by implements Cloneable interface, otherwise throws Exception
 * and public clone instead protected
 * Prototype is really useful when we are working with Composite and Decorator patterns
 */
// This class represents abstract prototype for all our Prototype classes and defines 'clone' method
//Cloneable interface indicates our class are able to cloning operation
public abstract class GameUnit implements Cloneable {
    @Getter
    private Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    //this method provides copy of our particular object
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        //first we need to consider if we prefer to make shallow or deep copy of object ( state )
        //Point3D is immutable class, so we can do shallow copy
        GameUnit unit = (GameUnit) super.clone(); //shallow copy
        //resetState the position of cloned object
        unit.initialize();
        return unit;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        resetState();
    }

    protected abstract void resetState();

    public GameUnit(float x, float y, float z) {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

}
