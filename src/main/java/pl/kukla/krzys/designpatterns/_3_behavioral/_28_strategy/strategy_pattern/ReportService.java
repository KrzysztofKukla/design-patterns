package pl.kukla.krzys.designpatterns._3_behavioral._28_strategy.strategy_pattern;

import java.util.List;

/**
 * @author Krzysztof Kukla
 */
public interface ReportService {

    void generate(List<String> properties);

}
