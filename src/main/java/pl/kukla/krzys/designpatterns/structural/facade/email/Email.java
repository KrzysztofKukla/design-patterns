package pl.kukla.krzys.designpatterns.structural.facade.email;

import lombok.Builder;

/**
 * @author Krzysztof Kukla
 */
@Builder
public class Email {
    private Template template;
    private Stationary stationary;
    private Object object;

}
