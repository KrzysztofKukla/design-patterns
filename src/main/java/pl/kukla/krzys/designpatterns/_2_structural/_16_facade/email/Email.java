package pl.kukla.krzys.designpatterns._2_structural._16_facade.email;

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
