package pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.test;

import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.factories.AbstractLangFactory;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.factories.CPlusPlusLangFactory;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.factories.JavaLangFactory;
import pl.kukla.krzys.designpatterns._1_creational._08_abstractfactory.lang.model.Lang;

class LangFactoryTest {

    public static void main(String[] args) {
        AbstractLangFactory langFactory = getLangFactory("cppa");
        Lang lang = langFactory.build();
        String langName = lang.getName();
        System.out.println(langName);
    }

    public static AbstractLangFactory getLangFactory(String extension) {
        switch (extension) {
            case "java":
                return new JavaLangFactory();
            case "cpp":
                return new CPlusPlusLangFactory();
            default:
                throw new IllegalStateException("Invalid language");
        }
    }
}
