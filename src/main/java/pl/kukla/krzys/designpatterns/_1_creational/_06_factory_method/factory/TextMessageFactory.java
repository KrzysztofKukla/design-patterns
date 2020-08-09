package pl.kukla.krzys.designpatterns._1_creational._06_factory_method.factory;

import pl.kukla.krzys.designpatterns._1_creational._06_factory_method.domain.Message;
import pl.kukla.krzys.designpatterns._1_creational._06_factory_method.domain.TextMessage;

/**
 * @author Krzysztof Kukla
 */
public class TextMessageFactory implements AbstractMessageFactory {
    @Override
    public Message buildMessage() {
        TextMessage textMessage = new TextMessage();
        return textMessage;
    }

}
