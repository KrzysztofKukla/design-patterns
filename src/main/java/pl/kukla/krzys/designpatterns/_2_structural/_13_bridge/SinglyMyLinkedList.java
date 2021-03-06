package pl.kukla.krzys.designpatterns._2_structural._13_bridge;

/**
 * @author Krzysztof Kukla
 */
public class SinglyMyLinkedList<T> implements MyLinkedList<T> {

    private class Node {
        private Object data;
        private Node next;

        private Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    private int size;
    private Node top;
    private Node last;

    @Override
    public void addFirst(T element) {
        if (top == null) {
            last = top = new Node(element, null);
        } else {
            top = new Node(element, top);
        }
        size++;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public void addLast(T t) {

    }

    @Override
    public T removeLast() {
        return null;
    }

}
