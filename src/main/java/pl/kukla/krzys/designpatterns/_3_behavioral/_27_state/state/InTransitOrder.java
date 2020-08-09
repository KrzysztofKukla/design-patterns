package pl.kukla.krzys.designpatterns._3_behavioral._27_state.state;

/**
 * @author Krzysztof Kukla
 */
//w transporcie
public class InTransitOrder implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("handleCancellation for InTransit State");
        System.out.println("Call to gateway to contact Courier Service for cancellation and Rollback Transaction");
        System.out.println("Call to gateway to Rollback Transaction");
        return 20;
    }

}
