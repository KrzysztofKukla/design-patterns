package pl.kukla.krzys.designpatterns._2_structural._13_bridge;

/**
 * @author Krzysztof Kukla
 */
public class Queue<T> implements FifoCollection<T> {

    //this is bridge to LinkedList class
    //so we can use operations defined in LinkedList from Queue collection
    private final MyLinkedList<T> myLinkedList;

    public Queue(MyLinkedList<T> myLinkedList) {
        this.myLinkedList = myLinkedList;
    }

    @Override
    public void offer(T t) {
        myLinkedList.addLast(t);
    }

    @Override
    public T poll() {
        return myLinkedList.removeFirst();
    }

}
