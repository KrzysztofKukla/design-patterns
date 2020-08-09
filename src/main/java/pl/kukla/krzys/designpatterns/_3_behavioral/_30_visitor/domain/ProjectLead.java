package pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain;

import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Krzysztof Kukla
 */
public class ProjectLead extends AbstractEmployee {
    private List<Employee> directReports = new ArrayList<>();

    public ProjectLead(String name, Employee... employees) {
        super(name);
        Arrays.stream(employees).forEach(e -> directReports.add(e));
    }

    @Override
    public List<Employee> getDirectReports() {
        return directReports;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProjectLead(this);
    }

}
