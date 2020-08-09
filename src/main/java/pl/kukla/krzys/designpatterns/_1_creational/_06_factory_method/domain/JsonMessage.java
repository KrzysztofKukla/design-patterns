package pl.kukla.krzys.designpatterns._1_creational._06_factory_method.domain;

/**
 * @author Krzysztof Kukla
 */
public class JsonMessage extends Message {
    @Override
    public String getContent() {
        return "Json";
    }

}
