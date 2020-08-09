package pl.kukla.krzys.designpatterns._3_behavioral._28_strategy.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._28_strategy.ReportGenerator;
import pl.kukla.krzys.designpatterns._3_behavioral._28_strategy.ReportGeneratorImpl;
import pl.kukla.krzys.designpatterns._3_behavioral._28_strategy.strategy_pattern.QualityControlReportService;

/**
 * @author Krzysztof Kukla
 */
public class ReportGeneratorImplTest {

    private ReportGenerator reportGenerator;

    @Test
    void qualityControlReportTest() throws Exception {
        reportGenerator = new ReportGeneratorImpl(new QualityControlReportService());
        reportGenerator.generate();
    }

}
