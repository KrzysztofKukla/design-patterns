package pl.kukla.krzys.designpatterns._1_creational._06_factory_method;

import pl.kukla.krzys.designpatterns._1_creational._06_factory_method.domain.Message;
import pl.kukla.krzys.designpatterns._1_creational._06_factory_method.factory.AbstractMessageFactory;

/**
 * @author Krzysztof Kukla
 */
public class MessageFactory {
    private MessageFactory() {
    }

    public static Message buildMessage(AbstractMessageFactory abstractMessageFactory) {
        return abstractMessageFactory.buildMessage();
    }

}
