package pl.kukla.krzys.designpatterns.behavioral.observer;

/**
 * Observer pattern is also called as Publisher-Subscriber or Pub-Sub
 * Observer allows to notify multiple objects whenever specified object changed status
 * if specified object changed it status then we will notify multiple objects about that
 * Observers ( Listeners ) - objects which observe status of specified object
 * we have single object which is going to publish whenever its state is changed - called Observable ( observowany )
 * and we have multiple observers who are subscribed to this object, so they get notification whenever publisher object state has been changed
 * using Observer pattern we are making it using interfaces, so without any coupling between classes
 * <p>
 * but some Observer can be interested in only some particular state property - NOT whole Object
 * we need to register ( attach ) or deregister ( detach ) observer ( listener ) to our subject ( observable object )
 * avoid to set notification for each method, because this causes recurrence infinity loop
 */
public interface OrderObserver {
    void updated(Order order);

}
