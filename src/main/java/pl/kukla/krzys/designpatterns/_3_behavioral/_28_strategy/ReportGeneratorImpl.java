package pl.kukla.krzys.designpatterns._3_behavioral._28_strategy;

import org.springframework.stereotype.Service;
import pl.kukla.krzys.designpatterns._3_behavioral._28_strategy.strategy_pattern.ReportService;

/**
 * @author Krzysztof Kukla
 */
@Service
public class ReportGeneratorImpl implements ReportGenerator {

    private final ReportService reportService;

    public ReportGeneratorImpl(ReportService reportService) {
        this.reportService = reportService;
    }

    @Override
    public void generate() {
        reportService.generate(null);
    }

}
