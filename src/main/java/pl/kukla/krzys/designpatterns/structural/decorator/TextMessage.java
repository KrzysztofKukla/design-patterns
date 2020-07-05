package pl.kukla.krzys.designpatterns.structural.decorator;

import lombok.RequiredArgsConstructor;

/**
 * @author Krzysztof Kukla
 */
@RequiredArgsConstructor
public class TextMessage implements Message {

    private final String content;

    @Override
    public String getContent() {
        return content;
    }

}
