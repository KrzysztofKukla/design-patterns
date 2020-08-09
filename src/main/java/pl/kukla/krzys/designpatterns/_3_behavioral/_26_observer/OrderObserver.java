package pl.kukla.krzys.designpatterns._3_behavioral._26_observer;

/**
 * Observer pattern is also called as Publisher-Subscriber or Pub-Sub
 * JMS ( Java Message Service ) uses this pattern - register with JMS Broker
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
 * we cane register observer for specific event only
 * we can have performance issue if we will register multiple observers for object especially if we will have haevy calculation in those methods
 * observe method ( 'updated' in this case ) should be short and simple to avoid performance and complicate issue
 * we can have observers register for a specific property or event
 */
public interface OrderObserver {
    void updated(Order order);

}
