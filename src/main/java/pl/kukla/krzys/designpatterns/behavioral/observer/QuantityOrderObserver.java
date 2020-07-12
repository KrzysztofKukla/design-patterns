package pl.kukla.krzys.designpatterns.behavioral.observer;

/**
 * @author Krzysztof Kukla
 */
public class QuantityOrderObserver implements OrderObserver {
    @Override
    public void updated(Order order) {
        int count = order.getCount();
        if (count > 5) {
            order.setShippingCost(10);
        }
    }

}
