package pl.kukla.krzys.designpatterns._1_creational._10_objectpool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

/**
 * @author Krzysztof Kukla
 */
@Slf4j
public class ObjectPool<T extends Poolable> {

    //object in memory cache, should be thread safe
    //can be other structure data as well
    private final BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingQueue<>();
        for (int i = 0; i < count; i++) {
            availablePool.offer(creator.get());
        }
    }

    //get the object from  Pool
    public T get() {
        try {
            return availablePool.take();
            //throws Exception, because is blocked when BlockingQueue is empty
        } catch (InterruptedException e) {
            log.error("take() was interrupted");
        }
        return null;
    }

    //release object again to Pool
    //we've used object for some time and then we need to release/put ( zwalniać ) again to ObjectPool with beginning state ( need to reset state of
    // object )
    public void release(T object) {
        object.reset();
        try {
            availablePool.put(object);
        } catch (InterruptedException e) {
            log.error("put() was interrupted");
        }
    }

}
