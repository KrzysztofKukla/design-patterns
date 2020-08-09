package pl.kukla.krzys.designpatterns._3_behavioral._26_observer.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._26_observer.Order;
import pl.kukla.krzys.designpatterns._3_behavioral._26_observer.OrderObserver;
import pl.kukla.krzys.designpatterns._3_behavioral._26_observer.PriceOrderObserver;

/**
 * @author Krzysztof Kukla
 */
public class OrderObserverTest {

    @Test
    void observerTest() throws Exception {
        Order order = new Order("100");
        OrderObserver priceObserver = new PriceOrderObserver();
        order.attach(priceObserver);
        order.addItem(50);
        order.addItem(180);
        System.out.println(order);
    }

}
