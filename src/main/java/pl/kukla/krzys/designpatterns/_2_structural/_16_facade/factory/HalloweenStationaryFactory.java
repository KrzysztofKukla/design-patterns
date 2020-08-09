package pl.kukla.krzys.designpatterns._2_structural._16_facade.factory;

import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.HalloweenStationary;
import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.Stationary;

/**
 * @author Krzysztof Kukla
 */
public class HalloweenStationaryFactory implements StationaryFactory {
    @Override
    public Stationary createStationary() {
        return new HalloweenStationary();
    }

}
