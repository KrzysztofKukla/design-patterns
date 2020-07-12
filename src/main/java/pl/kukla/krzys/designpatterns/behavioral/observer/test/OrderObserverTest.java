package pl.kukla.krzys.designpatterns.behavioral.observer.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns.behavioral.observer.Order;
import pl.kukla.krzys.designpatterns.behavioral.observer.OrderObserver;
import pl.kukla.krzys.designpatterns.behavioral.observer.PriceOrderObserver;

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
