package pl.kukla.krzys.designpatterns.structural.facade.factory;

import pl.kukla.krzys.designpatterns.structural.facade.email.HalloweenStationary;
import pl.kukla.krzys.designpatterns.structural.facade.email.Stationary;

/**
 * @author Krzysztof Kukla
 */
public class HalloweenStationaryFactory implements StationaryFactory {
    @Override
    public Stationary createStationary() {
        return new HalloweenStationary();
    }

}
