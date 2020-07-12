package pl.kukla.krzys.designpatterns.structural.facade.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns.structural.facade.EmailFacade;
import pl.kukla.krzys.designpatterns.structural.facade.email.Order;
import pl.kukla.krzys.designpatterns.structural.facade.email.TemplateType;
import pl.kukla.krzys.designpatterns.structural.facade.factory.HalloweenStationaryFactory;

/**
 * @author Krzysztof Kukla
 */
public class EmailFacadeTest {

    @Test
    void facadeTest() throws Exception {
        EmailFacade emailFacade = new EmailFacade();
        boolean sentResult = emailFacade.sendOrderEmail(new Order("a", 23), TemplateType.EMAIL, new HalloweenStationaryFactory());
    }

}
