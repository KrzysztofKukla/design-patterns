package pl.kukla.krzys.designpatterns._2_structural._13_bridge;

/**
 * @author Krzysztof Kukla
 */
public class Queue<T> implements FifoCollection<T> {

    //this is bridge to LinkedList class
    //so we can use operations defined in LinkedList from Queue collection
    private final LinkedList<T> linkedList;

    public Queue(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void offer(T t) {
        linkedList.addLast(t);
    }

    @Override
    public T poll() {
        return linkedList.removeFirst();
    }

}
