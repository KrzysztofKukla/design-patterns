package pl.kukla.krzys.designpatterns._2_structural._14_decorator.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._2_structural._14_decorator.HtmlMessageDecorator;
import pl.kukla.krzys.designpatterns._2_structural._14_decorator.Message;
import pl.kukla.krzys.designpatterns._2_structural._14_decorator.TextMessage;

/**
 * @author Krzysztof Kukla
 */
public class MessageTest {

    private static final String CONTENT = "<html>sssss</html>";

    @Test
    void textMessageText() throws Exception {
        Message message = new TextMessage(CONTENT);
        System.out.println(message.getContent());
    }

    @Test
    void decoratorInUsed() throws Exception {
        Message message = new HtmlMessageDecorator(new TextMessage(CONTENT));
        System.out.println(message.getContent());
    }

}
