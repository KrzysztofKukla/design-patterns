package pl.kukla.krzys.designpatterns._1_creational._10_objectpool.test;

import javafx.geometry.Point2D;
import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._1_creational._10_objectpool.Bitmap;
import pl.kukla.krzys.designpatterns._1_creational._10_objectpool.ObjectPool;

import java.util.function.Supplier;

/**
 * @author Krzysztof Kukla
 */
public class ObjectPoolTest {
    private static final ObjectPool<Bitmap> BITMAP_OBJECT_POOL = new ObjectPool<>(bitmapSupplier(), 5);

    private static Supplier<Bitmap> bitmapSupplier() {
        return () -> new Bitmap("logo.bmp");
    }

    @Test
    void bitmapTest() throws Exception {
        Bitmap bitmap1 = BITMAP_OBJECT_POOL.get();
        bitmap1.setLocation(new Point2D(10, 10));

        Bitmap bitmap2 = BITMAP_OBJECT_POOL.get();
        bitmap2.setLocation(new Point2D(-10, 0));

        bitmap1.draw();
        bitmap2.draw();

        //release objects back into Pool to be able re-use
        BITMAP_OBJECT_POOL.release(bitmap1);
        BITMAP_OBJECT_POOL.release(bitmap2);
    }

}
