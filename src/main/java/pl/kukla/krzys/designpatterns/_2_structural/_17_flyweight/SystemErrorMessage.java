package pl.kukla.krzys.designpatterns._2_structural._17_flyweight;

/**
 * @author Krzysztof Kukla
 */
//concrete Flyweight - shared in multiple contexts
//we can have multiple instances of this class, but 2 intrinsic are final in each Object
public class SystemErrorMessage implements ErrorMessage {

    //2 intrinsic properties
    private final String messageTemplate; // $errorCode will be replace with intrinsic messageTemplate

    //http://somedomain.com/help?error=
    private final String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    //extrinsic state
    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
    }

}
