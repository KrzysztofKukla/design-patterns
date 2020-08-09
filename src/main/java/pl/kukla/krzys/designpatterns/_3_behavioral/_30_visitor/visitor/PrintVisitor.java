package pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.visitor;

import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.Manager;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.Programmer;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.ProjectLead;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.VicePresident;

/**
 * @author Krzysztof Kukla
 */
public class PrintVisitor implements Visitor {
    private static final String PRINT_VISITOR = "PrintVisitor-> ";

    @Override
    public void visitProgrammer(Programmer programmer) {
        String message = PRINT_VISITOR + programmer.getName() + " " + programmer.getSkill();
        System.out.println(message);
    }

    @Override
    public void visitProjectLead(ProjectLead projectLead) {
        String message = PRINT_VISITOR + projectLead.getName() + " " + projectLead.getDirectReports().size();
        System.out.println(message);
    }

    @Override
    public void visitManager(Manager manager) {
        String message = PRINT_VISITOR + manager.getName() + " " + manager.getDirectReports().size();
        System.out.println(message);
    }

    @Override
    public void visitVicePresident(VicePresident vicePresident) {
        String message = PRINT_VISITOR + vicePresident.getName() + " " + vicePresident.getDirectReports().size();
        System.out.println(message);
    }

}
