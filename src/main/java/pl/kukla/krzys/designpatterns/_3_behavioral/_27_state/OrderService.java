package pl.kukla.krzys.designpatterns._3_behavioral._27_state;

/**
 * we use State design pattern when we have na Object which its behavior is completely tied to its internal state
 * similar to Strategy, but in State design pattern we have different behaviors ( implementation ) base on state of object
 * Object behaves ( zachowuje sie ) differently base on its internal state
 * we create specif behaviour ( specif classes ) for each separate state
 * to implement, first we need to identify possible states for Object - each State will be separate class
 * in client class we delegate current operation to its state operation
 * transition to other state is executed only base on some conditions
 */
//Context class
public interface OrderService {
    double cancel();

    void paymentSuccessful();

    void dispatched();

    void delivered();

}
