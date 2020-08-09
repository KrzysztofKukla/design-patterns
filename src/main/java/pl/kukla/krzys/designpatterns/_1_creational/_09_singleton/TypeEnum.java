package pl.kukla.krzys.designpatterns._1_creational._09_singleton;

/**
 * @author Krzysztof Kukla
 */
// enum it the best way to implement Singleton
public enum TypeEnum {
    SMALL, MEDIUM, LARGE;

    //private constructor for enum
    TypeEnum() {
    }
}
