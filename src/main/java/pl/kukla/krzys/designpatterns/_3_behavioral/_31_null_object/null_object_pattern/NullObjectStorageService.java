package pl.kukla.krzys.designpatterns._3_behavioral._31_null_object.null_object_pattern;

import lombok.extern.slf4j.Slf4j;
import pl.kukla.krzys.designpatterns._3_behavioral._31_null_object.Report;

/**
 * @author Krzysztof Kukla
 */
@Slf4j
public class NullObjectStorageService implements StorageService {
    @Override
    public void save(Report report) {
        log.error("Null object save method, doing nothing");
    }

}
