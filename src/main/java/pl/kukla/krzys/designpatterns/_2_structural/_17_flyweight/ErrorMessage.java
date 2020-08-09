package pl.kukla.krzys.designpatterns._2_structural._17_flyweight;

/**
 * used when we have large number of objects and maintenance these instances in memory can be costly ( performance concern - obawy )
 * but when we can easily separate out intrinsic and extrinsic states form our object
 * Flyweight allows to share object in multiple context, but instead of sharing whole object we divide object into parts
 * we have intrinsic state of object ( state is final and is shared in every context ) intrinsic state does NOT change its state no matter where
 * object is used
 * we can create objects only with intrinsic state and share them in multiple context
 * another part of object is extrinsic state - state specific per context where object is used
 * first we need to identify intrinsic and extrinsic state of our object
 * Flyweight pattern very often is useful in graphical application
 * Factory is always necessary, because client code needs the central place where can ask for shared Flyweight object
 * number shared instances can be large and containing all of them in central place is good idea
 * Flyweight is often used like Wrapper classes like Byte, Short, Integer etc. - valueOf is static factory method
 * Float and Double don't use Flyweight
 * running cost for maintaining of extrinsic state
 * is often difficult to find perfect candidate for Flyweight, because most of objects are completely mutable orcompletelyy immutable
 */
//interface implemented by Flyweight
public interface ErrorMessage {
    String getText(String code);

}
