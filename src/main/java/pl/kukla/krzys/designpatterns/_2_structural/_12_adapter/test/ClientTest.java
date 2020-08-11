package pl.kukla.krzys.designpatterns._2_structural._12_adapter.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._2_structural._12_adapter.MyServiceImpl;
import pl.kukla.krzys.designpatterns._2_structural._12_adapter.client.Client;
import pl.kukla.krzys.designpatterns._2_structural._12_adapter.legacy.LegacyFunctionalityAdapter;
import pl.kukla.krzys.designpatterns._2_structural._12_adapter.legacy.SomeLegacyObject;

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
        LegacyFunctionalityAdapter legacyFunctionalityAdapter = new LegacyFunctionalityAdapter(new SomeLegacyObject());
        client = new Client(legacyFunctionalityAdapter);
        client.computeService(10);
    }

}
