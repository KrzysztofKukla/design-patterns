package pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.Order;
import pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.template_method.HtmlPrinter;
import pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.template_method.OrderPrinter;
import pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.template_method.TextPrinter;

/**
 * @author Krzysztof Kukla
 */
public class TemplateMethodTest {

    @Test
    void textPrinter() throws Exception {
        Order order = new Order("1001");
        order.addItem("first", 100.1);
        order.addItem("second", 200.2);
        order.addItem("third", 300.3);

        OrderPrinter textPrinter = new TextPrinter();
        textPrinter.printOrder(order, "1001.txt");
    }

    @Test
    void htmlPrinter() throws Exception {
        Order order = new Order("1001");
        order.addItem("first", 100.1);
        order.addItem("second", 200.2);
        order.addItem("third", 300.3);

        OrderPrinter textPrinter = new HtmlPrinter();
        textPrinter.printOrder(order, "1001.html");
    }

}
