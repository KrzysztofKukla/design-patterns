package pl.kukla.krzys.designpatterns._3_behavioral._27_state;

import pl.kukla.krzys.designpatterns._3_behavioral._27_state.state.CancelledOrder;
import pl.kukla.krzys.designpatterns._3_behavioral._27_state.state.DeliveredOrder;
import pl.kukla.krzys.designpatterns._3_behavioral._27_state.state.InTransitOrder;
import pl.kukla.krzys.designpatterns._3_behavioral._27_state.state.OrderState;
import pl.kukla.krzys.designpatterns._3_behavioral._27_state.state.PaidOrder;

/**
 * @author Krzysztof Kukla
 */
public class OrderServiceImpl implements OrderService {

    private OrderState currentState;

    public OrderServiceImpl(OrderState currentState) {
        this.currentState = currentState;
    }

    //behavior of 'cancel' method is entirely dependent on State is currently on Object
    @Override
    public double cancel() {
        double charges = currentState.handleCancellation();
        currentState = new CancelledOrder();
        return charges;
    }

    @Override
    public void paymentSuccessful() {
        currentState = new PaidOrder();
    }

    //wysłane
    @Override
    public void dispatched() {
        //in real life we have to have validation of current state
        // so we will be able to move to 'InTransitState' state only when current state is for example 'PaidOrder'
        currentState = new InTransitOrder();
    }

    @Override
    public void delivered() {
        currentState = new DeliveredOrder();
    }

}
