package pl.kukla.krzys.designpatterns._3_behavioral._23_mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Mediator allows to encapsulate complex communication between objects and notify each other about state change and decouple tightly coupled ( scisle
 * powiazane ) objects
 * in this pattern each objects only know about Mediator object, whenever its object state is changed then notify Mediator only about that
 * and then Mediator notify all the remaining objects in communication
 * Observer defines one-to-many communication between objects - ONE direction for
 * in Observer we have single object and there are multiple listeners which listen state changes in that object
 * Mediator helps us remove complexity between objects interaction or object collaboration
 * Mediator design pattern allows to encapsulates that interaction/communication in single object
 * and it allows to have loose coupling between these objects
 * in Mediator pattern this interaction is within Mediator object & interacting objects only know about the Mediator object
 * so in Mediator we have group of objects and if its state is changing, it will tell Mediator about that,
 * then Mediator will take care of notifying all the other remaining objects, that these objects state have been changed
 * Mediator should be able to identify which object has sent notification for State change
 * Dispatcher servlet in Spring is example of Mediator design pattern
 */
//Mediator
public class UIMediator {

    //list of objects which participate in collaboration
    private List<UIControl> colleagues = new ArrayList<>();

    //to register object in Mediator
    public void register(UIControl uiControl) {
        //to simplify we are not checking duplicated or null objects
        colleagues.add(uiControl);
    }

    //method called by these objects to notify Mediator that their state have been changed
    //Mediator this passed reference to figure out which of the colleagues has been changed
    //main job of Mediator here is to tell remaining objects that this control is changed in its state
    public void valueChanged(UIControl uiControl) {
        colleagues.stream()
            //filtering given uiControl from our collection
            .filter(c -> c != uiControl)
            //to tell these objects that somebody else changed its state
            .forEach(c -> c.controlChange(uiControl));
    }

}
