package pl.kukla.krzys.designpatterns._2_structural._14_decorator;

import org.apache.commons.text.StringEscapeUtils;

/**
 * Decorator allows decorating ( add additional functionality ) to existing code
 * Decorator always add/changes something from the behavior of original object
 * Decorator contains only single object vs Composite contains children of objects
 */
public class HtmlMessageDecorator implements Message {

    private final Message message;

    public HtmlMessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        //here we added special functionality to existed code ( message object )
        return StringEscapeUtils.escapeHtml4(message.getContent());
    }

}
