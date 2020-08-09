package pl.kukla.krzys.designpatterns._3_behavioral._26_observer;

/**
 * @author Krzysztof Kukla
 */
public class PriceOrderObserver implements OrderObserver {
    @Override
    public void updated(Order order) {
        if (order.getItemCost() > 200) {
            order.setDiscount(20);
        }
    }

}
