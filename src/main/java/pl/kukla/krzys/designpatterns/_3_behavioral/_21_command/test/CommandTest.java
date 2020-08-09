package pl.kukla.krzys.designpatterns._3_behavioral._21_command.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._21_command.client.CommandClient;

/**
 * @author Krzysztof Kukla
 */
public class CommandTest {
    @Test
    void commandTest() throws Exception {
        CommandClient.commandExecutor();
    }

}
