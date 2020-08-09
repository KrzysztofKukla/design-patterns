package pl.kukla.krzys.designpatterns._3_behavioral._27_state.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._27_state.OrderService;
import pl.kukla.krzys.designpatterns._3_behavioral._27_state.OrderServiceImpl;
import pl.kukla.krzys.designpatterns._3_behavioral._27_state.state.NewOrder;

/**
 * @author Krzysztof Kukla
 */
public class OrderServiceStateTest {

    private OrderService orderService;

    @BeforeEach
    void setUp() {
        orderService = new OrderServiceImpl(new NewOrder());

    }

    @Test
    void newStateTest() throws Exception {
        orderService.cancel();
    }

    @Test
    void paidOrderStateTest() throws Exception {
        orderService.paymentSuccessful();
        orderService.cancel();
    }

    @Test
    void deliveredOrderStateTest() throws Exception {
        orderService.paymentSuccessful();
        orderService.delivered();
        orderService.cancel();
    }

}
