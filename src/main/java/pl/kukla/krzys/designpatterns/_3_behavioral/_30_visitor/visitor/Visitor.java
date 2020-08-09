package pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.visitor;

import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.Manager;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.Programmer;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.ProjectLead;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.VicePresident;

/**
 * @author Krzysztof Kukla
 */
public interface Visitor {
    void visitProgrammer(Programmer programmer);

    void visitProjectLead(ProjectLead projectLead);

    void visitManager(Manager manager);

    void visitVicePresident(VicePresident vicePresident);

}
