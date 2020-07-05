package pl.kukla.krzys.designpatterns.structural.decorator;

import org.apache.commons.text.StringEscapeUtils;

/**
 * Decorator allows to decorate ( add additional functionality ) to existing code
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
