package pl.kukla.krzys.designpatterns._3_behavioral._31_null_object.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._31_null_object.ComplexService;
import pl.kukla.krzys.designpatterns._3_behavioral._31_null_object.null_object_pattern.NullObjectStorageService;
import pl.kukla.krzys.designpatterns._3_behavioral._31_null_object.null_object_pattern.StorageServiceImpl;

/**
 * @author Krzysztof Kukla
 */
public class ComplexServiceTest {

    @Test
    void storageServiceTest() throws Exception {
        ComplexService complexService = new ComplexService(new StorageServiceImpl(), "Simple report");
        complexService.generateReport();
    }

    @Test
    void nullObjectStorageServiceTest() throws Exception {
        ComplexService complexService = new ComplexService(new NullObjectStorageService(), "Simple report");
        complexService.generateReport();
    }

}
