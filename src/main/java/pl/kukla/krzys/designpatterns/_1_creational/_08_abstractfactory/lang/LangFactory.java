package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang;

import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.factories.AbstractLangFactory;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.model.Lang;

public class LangFactory {

    public static Lang build(AbstractLangFactory factory) {
        return factory.build();
    }
}
