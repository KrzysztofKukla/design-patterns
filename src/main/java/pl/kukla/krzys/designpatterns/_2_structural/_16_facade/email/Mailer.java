package pl.kukla.krzys.designpatterns._2_structural._16_facade.email;

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
