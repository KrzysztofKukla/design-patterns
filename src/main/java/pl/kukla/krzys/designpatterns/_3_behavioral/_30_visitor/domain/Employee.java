package pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain;

import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.visitor.Visitor;

import java.util.Collection;

/**
 * @author Krzysztof Kukla
 */
public interface Employee {
    int getEmployeeId();

    int getPerformanceRating();

    void setPerformanceRating(int rating);

    Collection<Employee> getDirectReports();

    void accept(Visitor visitor);

}
