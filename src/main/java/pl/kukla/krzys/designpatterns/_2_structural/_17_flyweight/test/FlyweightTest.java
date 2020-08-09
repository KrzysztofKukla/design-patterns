package pl.kukla.krzys.designpatterns._2_structural._17_flyweight.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._2_structural._17_flyweight.SystemErrorMessage;
import pl.kukla.krzys.designpatterns._2_structural._17_flyweight.UserBannedErrorMessage;
import pl.kukla.krzys.designpatterns._2_structural._17_flyweight.factory.ErrorMessageFactory;

/**
 * @author Krzysztof Kukla
 */
public class FlyweightTest {

    @Test
    void systemErrorMessageTest() throws Exception {
        SystemErrorMessage genericError = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GENERIC_SYSTEM_ERROR);
        System.out.println(genericError.getText("1234"));
    }

    @Test
    void userBannedErrorTest() throws Exception {
        UserBannedErrorMessage userBannedErrorMessage = ErrorMessageFactory.getInstance().getUserBannedErrorMessage("3456");
        System.out.println(userBannedErrorMessage.getText(null));
    }

}
