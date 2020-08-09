package pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.template_method;

import pl.kukla.krzys.designpatterns._3_behavioral._29_template_method.Order;

import java.util.Map;

/**
 * @author Krzysztof Kukla
 */
public class HtmlPrinter extends OrderPrinter {
    @Override
    protected String header() {
        return "<html><head>Order Details</head></html>";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "<h1> Order id #" + order.getId() + "</h1>";
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder sb = new StringBuilder("<p><ul>");
        for (Map.Entry<String, Double> entry : order.getItems().entrySet()) {
            sb.append("<li>" + entry.getKey() + " $" + entry.getValue() + "</li>");
        }
        sb.append("</ul></p>");
        return sb.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return "</br><hr/><h3>Total $" + order.getTotal() + "</h3>";
    }

    @Override
    protected String footer() {
        return "</body></html>";
    }

}
