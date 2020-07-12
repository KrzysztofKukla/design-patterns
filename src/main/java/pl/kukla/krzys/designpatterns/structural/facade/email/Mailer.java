package pl.kukla.krzys.designpatterns.structural.facade.email;

/**
 * @author Krzysztof Kukla
 */

public class Mailer {

    private Mailer() {
    }

    public static boolean send(Email email) {
        //TODO send mail message
        return true;
    }

}
