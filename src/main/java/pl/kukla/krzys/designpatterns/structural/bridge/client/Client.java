package pl.kukla.krzys.designpatterns.structural.bridge.client;

import pl.kukla.krzys.designpatterns.structural.bridge.FifoCollection;

/**
 * Bridge allows to decouple our implementation and use abstraction instead concrete implementation without effecting
 * it makes our code much more flexible
 * we can add operation on abstraction and we don't have to change implementation
 * to achieve that we have to create two separate inheritance hierarchies and use composition
 * Bridge needs to be design at the beginning, because later it is very hard to refactor code to use bridge design pattern
 */
public class Client<T> {
    private final FifoCollection<T> fifoCollection;

    public Client(FifoCollection<T> fifoCollection) {
        this.fifoCollection = fifoCollection;
    }

    public void manageFifoCollection(T t) {
        fifoCollection.offer(t);
    }

}
