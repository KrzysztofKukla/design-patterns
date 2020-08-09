package pl.kukla.krzys.designpatterns._2_structural._16_facade.factory;

import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.EmailTemplate;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.Template;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.TemplateType;

/**
 * @author Krzysztof Kukla
 */
public class TemplateFactory {
    public static Template createTemplateFactory(TemplateType templateType) {
        switch (templateType) {
            case EMAIL:
                return new EmailTemplate();
            default:
                throw new IllegalArgumentException(templateType.name());
        }
    }

}
