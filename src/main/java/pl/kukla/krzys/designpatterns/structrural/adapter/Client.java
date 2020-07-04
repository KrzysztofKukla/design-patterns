package pl.kukla.krzys.designpatterns.structrural.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Krzysztof Kukla
 */
@Slf4j
public class Client {
    private final MyService myService;

    public Client(MyService myService) {
        this.myService = myService;
    }

    public void computeService(int value){
        Integer result = myService.compute(value);
      log.info("Result is: {}",result);
    }

}
