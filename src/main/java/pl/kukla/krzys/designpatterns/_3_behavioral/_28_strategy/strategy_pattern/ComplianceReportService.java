package pl.kukla.krzys.designpatterns._3_behavioral._28_strategy.strategy_pattern;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author Krzysztof Kukla
 */
@Slf4j
public class ComplianceReportService implements ReportService {
    @Override
    public void generate(List<String> properties) {
        log.info("Generating Compliance report");
    }

}
