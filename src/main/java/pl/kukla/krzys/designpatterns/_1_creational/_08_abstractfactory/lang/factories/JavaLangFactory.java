package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.factories;

import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.model.Java;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.model.Lang;

public class JavaLangFactory implements AbstractLangFactory {
    @Override
    public Lang build() {
        return new Java();
    }
}
