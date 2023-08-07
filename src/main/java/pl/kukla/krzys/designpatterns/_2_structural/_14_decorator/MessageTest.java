package pl.kukla.krzys.designpatterns._2_structural._14_decorator;

import org.junit.jupiter.api.Test;

/**
 * @author Krzysztof Kukla
 */
public class MessageTest {

    private static final String TEXT = "<html>sssss</html>";

    @Test
    void shouldUseSimpleTextMessage() throws Exception {
        Message message = new TextMessage(TEXT);
        System.out.println(message.getContent());
    }

    @Test
    void useUseDecorator() throws Exception {
        TextMessage messageText = new TextMessage(TEXT);
        Message message = new HtmlMessageDecorator(messageText);
        System.out.println(message.getContent());
    }

}
