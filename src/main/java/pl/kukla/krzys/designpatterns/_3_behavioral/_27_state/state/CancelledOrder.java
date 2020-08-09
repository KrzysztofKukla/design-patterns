package pl.kukla.krzys.designpatterns._3_behavioral._27_state.state;

/**
 * @author Krzysztof Kukla
 */
public class CancelledOrder implements OrderState {
    @Override
    public double handleCancellation() {
        //nobody should call cancel method on 'CancelledOrder' State
        throw new IllegalStateException("no allows to handleCancellation on CancelledOrder State");
    }

}
