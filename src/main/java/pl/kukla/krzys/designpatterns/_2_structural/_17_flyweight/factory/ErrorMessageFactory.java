package pl.kukla.krzys.designpatterns._2_structural._17_flyweight.factory;

import pl.kukla.krzys.designpatterns._2_structural._17_flyweight.SystemErrorMessage;
import pl.kukla.krzys.designpatterns._2_structural._17_flyweight.UserBannedErrorMessage;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Krzysztof Kukla
 */
//Flyweight factory - returns shared Flyweight based on key
public class ErrorMessageFactory {
    public enum ErrorType {
        GENERIC_SYSTEM_ERROR,
        PAGE_NOT_FOUND_ERROR,
        SERVER_ERROR
    }

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.GENERIC_SYSTEM_ERROR,
            new SystemErrorMessage("Generic system $errorCode", "http://google.com?q=")
        );
        errorMessages.put(ErrorType.PAGE_NOT_FOUND_ERROR,
            new SystemErrorMessage("Page not found $errorCode", "http://google.com?q=")
        );
    }

    public SystemErrorMessage getError(ErrorType errorType) {
        return errorMessages.get(errorType);
    }

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    public UserBannedErrorMessage getUserBannedErrorMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }

}
