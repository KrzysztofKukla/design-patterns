package pl.kukla.krzys.designpatterns._2_structural._16_facade.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.EmailFacade;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.Order;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.TemplateType;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.factory.HalloweenStationaryFactory;

import java.util.concurrent.ConcurrentHashMap;

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
