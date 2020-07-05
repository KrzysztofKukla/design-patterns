package pl.kukla.krzys.designpatterns.structural.adapter.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns.structural.adapter.MyServiceImpl;
import pl.kukla.krzys.designpatterns.structural.adapter.client.Client;
import pl.kukla.krzys.designpatterns.structural.adapter.legacy.LegacyClass;
import pl.kukla.krzys.designpatterns.structural.adapter.legacy.LegacyClassAdapter;

/**
 * @author Krzysztof Kukla
 */
public class ClientTest {

    private Client client;

    @Test
    void withoutAdapter() throws Exception {
        client = new Client(new MyServiceImpl());
        client.computeService(10);
    }

    @Test
    void useAdapter() throws Exception {
        LegacyClassAdapter legacyClassAdapter = new LegacyClassAdapter(new LegacyClass());
        client = new Client(legacyClassAdapter);
        client.computeService(10);
    }

}
