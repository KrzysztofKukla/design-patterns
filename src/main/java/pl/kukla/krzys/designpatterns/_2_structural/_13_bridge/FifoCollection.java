package pl.kukla.krzys.designpatterns._2_structural._13_bridge;

/**
 * Bridge allows to decouple our implementation and use abstraction instead concrete implementation without effecting
 * it makes our code much more flexible
 * we can add operation on abstraction and we don't have to change implementation
 * to achieve that we have to create two separate inheritance hierarchies and use composition
 */
public interface FifoCollection<T> {
    //add element to collection
    void offer(T t);

    //get element from collection
    T poll();

}
