package pl.kukla.krzys.designpatterns.structural.bridge;

/**
 * @author Krzysztof Kukla
 */
public interface LinkedList<T> {
    void addFirst(T t);

    T removeFirst();

    void addLast(T t);

    T removeLast();

}
