package pl.kukla.krzys.designpatterns._3_behavioral._27_state.state;

/**
 * @author Krzysztof Kukla
 */
public class PaidOrder implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("handleCancellation for PaidOrder State");
        System.out.println("Call to gateway to rollback PaymentTransaction");
        return 10;
    }

}
