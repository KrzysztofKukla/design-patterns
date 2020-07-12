package pl.kukla.krzys.designpatterns.structural.facade.factory;

import pl.kukla.krzys.designpatterns.structural.facade.email.Stationary;

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
