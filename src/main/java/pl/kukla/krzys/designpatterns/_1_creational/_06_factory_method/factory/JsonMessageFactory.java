package pl.kukla.krzys.designpatterns._1_creational._06_factory_method.factory;

import pl.kukla.krzys.designpatterns._1_creational._06_factory_method.domain.JsonMessage;
import pl.kukla.krzys.designpatterns._1_creational._06_factory_method.domain.Message;

/**
 * @author Krzysztof Kukla
 */
public class JsonMessageFactory implements AbstractMessageFactory {
    @Override
    public Message buildMessage() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.addDefaultHeader();
        jsonMessage.encrypt();
        return jsonMessage;
    }

}
