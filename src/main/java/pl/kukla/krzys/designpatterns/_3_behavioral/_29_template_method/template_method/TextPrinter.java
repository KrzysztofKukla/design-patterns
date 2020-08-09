package pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.template_method;

import pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.Order;

import java.util.Map;

/**
 * @author Krzysztof Kukla
 */
//concrete implementation for TemplateMethod design pattern
public class TextPrinter extends OrderPrinter {
    @Override
    protected String header() {
        return "header Order Details";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "Order number #" + order.getId();
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder sb = new StringBuilder("Items-----------------------");
        for (Map.Entry<String, Double> entry : order.getItems().entrySet()) {
            sb.append(entry.getKey() + " $" + entry.getValue() + "\n");
        }
        sb.append("-------------------------");
        return sb.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return "Total $" + order.getTotal();
    }

    @Override
    protected String footer() {
        return "";
    }

}
