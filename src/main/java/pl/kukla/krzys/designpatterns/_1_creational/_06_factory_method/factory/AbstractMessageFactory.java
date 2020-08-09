package pl.kukla.krzys.designpatterns._1_creational._06_factory_method.factory;

import pl.kukla.krzys.designpatterns._1_creational._06_factory_method.domain.Message;

/**
 * @author Krzysztof Kukla
 */
public interface AbstractMessageFactory {

    Message buildMessage();

}
