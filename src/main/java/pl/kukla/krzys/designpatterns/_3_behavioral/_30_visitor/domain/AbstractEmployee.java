package pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain;

import java.util.Collection;
import java.util.Collections;

/**
 * @author Krzysztof Kukla
 */
public abstract class AbstractEmployee implements Employee {
    private int employeeId;
    private int performanceRating;
    private String name;
    private static int employeeIdCounter = 101;

    protected AbstractEmployee(String name) {
        this.name = name;
        employeeId = employeeIdCounter++;
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int getPerformanceRating() {
        return performanceRating;
    }

    @Override
    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    public String getName() {
        return name;
    }

    public static int getEmployeeIdCounter() {
        return employeeIdCounter;
    }

    @Override
    public Collection<Employee> getDirectReports() {
        return Collections.emptyList();
    }

}
