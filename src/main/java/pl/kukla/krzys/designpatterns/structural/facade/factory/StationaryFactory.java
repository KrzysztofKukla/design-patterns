package pl.kukla.krzys.designpatterns.structural.facade.factory;

import pl.kukla.krzys.designpatterns.structural.facade.email.Stationary;

/**
 * @author Krzysztof Kukla
 */
public interface StationaryFactory {
    Stationary createStationary();

}
