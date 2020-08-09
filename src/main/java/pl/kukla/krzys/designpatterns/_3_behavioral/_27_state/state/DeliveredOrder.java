package pl.kukla.krzys.designpatterns._3_behavioral._27_state.state;

/**
 * @author Krzysztof Kukla
 */
public class DeliveredOrder implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("handleCancellation for DeliveredOrder State");
        System.out.println("Call to gateway to contact Courier Service for item pickup");
        System.out.println("Call to gateway to initialize upon receiving returned item");
        System.out.println("Then inspect the item and initialize Rollback Payment");
        return 30;
    }

}
