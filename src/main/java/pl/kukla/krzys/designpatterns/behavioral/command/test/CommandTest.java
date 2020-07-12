package pl.kukla.krzys.designpatterns.behavioral.command.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns.behavioral.command.client.CommandClient;

/**
 * @author Krzysztof Kukla
 */
public class CommandTest {
    @Test
    void commandTest() throws Exception {
        CommandClient.commandExecutor();
    }

}
