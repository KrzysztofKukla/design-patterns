package pl.kukla.krzys.designpatterns._3_behavioral._31_null_object.null_object_pattern;

import lombok.extern.slf4j.Slf4j;
import pl.kukla.krzys.designpatterns._3_behavioral._31_null_object.Report;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Krzysztof Kukla
 */
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Override
    public void save(Report report) {
        log.info("Writing report out");
        try (PrintWriter printWriter = new PrintWriter(report.getName() + ".txt")) {
            printWriter.println(report.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
