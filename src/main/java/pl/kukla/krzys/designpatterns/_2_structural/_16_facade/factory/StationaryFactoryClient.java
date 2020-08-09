package pl.kukla.krzys.designpatterns._2_structural._16_facade.factory;

import pl.kukla.krzys.designpatterns._2_structural._16_facade.email.Stationary;

/**
 * @author Krzysztof Kukla
 */
public class StationaryFactoryClient {
    private StationaryFactoryClient() {
    }

    public static Stationary createStationary(StationaryFactory stationaryFactory) {
        return stationaryFactory.createStationary();
    }

}
