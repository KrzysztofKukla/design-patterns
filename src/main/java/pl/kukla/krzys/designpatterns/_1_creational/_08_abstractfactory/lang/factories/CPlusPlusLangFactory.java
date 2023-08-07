package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.factories;

import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.model.CPlusPlus;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.model.Lang;

public class CPlusPlusLangFactory implements AbstractLangFactory {
    @Override
    public Lang build() {
        return new CPlusPlus();
    }
}
