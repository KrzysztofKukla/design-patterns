package pl.kukla.krzys.designpatterns._3_behavioral._27_state.state;

/**
 * @author Krzysztof Kukla
 */
public class NewOrder implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("handleCancellation for NewOrder State");
        return 0;
    }

}
