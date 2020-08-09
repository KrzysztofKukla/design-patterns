package pl.kukla.krzys.designpatterns._1_creational._06_factory_method.domain;

/**
 * @author Krzysztof Kukla
 */
public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "text";
    }

}
