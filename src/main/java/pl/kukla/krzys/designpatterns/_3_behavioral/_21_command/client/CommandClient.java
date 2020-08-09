package pl.kukla.krzys.designpatterns._3_behavioral._21_command.client;

import pl.kukla.krzys.designpatterns._3_behavioral._21_command.AddMemberCommand;
import pl.kukla.krzys.designpatterns._3_behavioral._21_command.Command;
import pl.kukla.krzys.designpatterns._3_behavioral._21_command.EWSService;
import pl.kukla.krzys.designpatterns._3_behavioral._21_command.MailTaskRunner;

/**
 * @author Krzysztof Kukla
 */
public class CommandClient {

    private CommandClient() {
    }

    public static void commandExecutor() throws InterruptedException {
        EWSService ewsService = new EWSService();

        Command c1 = new AddMemberCommand("mailAddress1", "mailGroup", ewsService);
        MailTaskRunner.getInstance().addCommand(c1);

        Command c2 = new AddMemberCommand("mailAddress2", "mailGroup", ewsService);
        MailTaskRunner.getInstance().addCommand(c2);

        //sleep Thread for 3 seconds to allow to finish our two worker Threads its job
        Thread.sleep(3000);
        MailTaskRunner.getInstance().shutdown();
    }

}
