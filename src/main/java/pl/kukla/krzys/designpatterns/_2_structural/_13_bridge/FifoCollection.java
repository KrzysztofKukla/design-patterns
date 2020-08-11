package pl.kukla.krzys.designpatterns._2_structural._13_bridge;

/**
 * in Bridge we separate abstraction used by client code from actual implementation of that functionality so the can change independently
 * Bridge allows to decouple implementation and abstraction so that we can change anyone of those without effecting to an other
 * so we add an operation in an abstraction and we don't have to change in our implementation
 * we achieve that by creating two separate inheritance hierarchies: one for abstraction and one for implementation
 * those 2 abstraction are NOT related together - only its instances are related by composition
 * and these two hierarchies are connected by composition called Bridge
 * MyLinkedList provides methods/operations that can be used by FifoCollection instance - connection is call Bridge
 */
public interface FifoCollection<T> {
    //add element to collection
    void offer(T t);

    //get element from collection
    T poll();

}
