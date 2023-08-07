package pl.kukla.krzys.designpatterns._2_structural._12_adapter.service.client;

import lombok.extern.slf4j.Slf4j;
import pl.kukla.krzys.designpatterns._2_structural._12_adapter.service.MyService;

/**
 * Adapter allows to unrelated classes ( with different API, legacy class ) work together with existing API ( interface )
 * typically used when we want to integrate existing legacy system with new code
 */
@Slf4j
public class Client {
    private final MyService myService;

    public Client(MyService myService) {
        this.myService = myService;
    }

    public void computeService(int value) {
        Integer result = myService.compute(value);
        log.info("Result is: {}", result);
    }

}
