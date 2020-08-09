package pl.kukla.krzys.designpatterns._3_behavioral._31_null_object;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.kukla.krzys.designpatterns._3_behavioral._31_null_object.null_object_pattern.StorageService;

/**
 * typically use 'null' as an value, so alternatively we can use NullObject pattern design
 * NullObject pattern indicates an absence of Object, is similar to Proxy, but in Proxy in same place we use the real object
 * using this pattern we don't have to check null value
 * NullObject does do nothing and stores nothing and can return any default value like 0 or true etc. without any implementation
 * so if and object or reference is null then we will do nothing - no side effect calling method on NullObject
 * NullObject pattern ensures do nothing when dealing with null object
 */
@Slf4j
@RequiredArgsConstructor
public class ComplexService {
    private final StorageService storageService;
    private final String reportName;

    public void generateReport() {
        log.info("Starting report build");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("Done with report");

        storageService.save(new Report(reportName));
    }

}
