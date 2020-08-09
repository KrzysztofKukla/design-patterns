package pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.Employee;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.Manager;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.Programmer;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.ProjectLead;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain.VicePresident;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.visitor.PrintVisitor;
import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.visitor.Visitor;

/**
 * Visitor allows to define new operations that can be perform on object without changing the class definition of that Object
 * Visitor object is going to visit all the objects in our application or module
 * Visitor is going to navigate ( traverse ) that object structure and is going to visit each node in that structure
 * each time when our Visitor visits a particular node then object in that node is going to call specific method on Visitor and pass itesf as na
 * argument
 * so Visitor object has method specified for particular class
 * all objects of that class know about that specific method and those objects are going to call specified method as pass themselves as an argument
 * and in this way Visitor provides some functionality on this object
 * Each time when we need new operations ( new functionality ) on existing object we create subclass of Visitor and provide those new operations
 * and visit object structure using newly created class
 * Object implements only 'accept' method where we pass Visitor as an argument and once we call that method all objects know about method that is
 * present in the Visitor specifically for that particular object and invoke this method and pass itself as an argument
 * Visitor has method specific for concrete class, that Visitor supports
 * each such class must provide 'accept' method where we pass Visitor reference, so we can use any type which implement Visitor interface
 * in this 'accept' method we call Visitor method which is specic to particular class
 */
public class VisitorTest {

    @Test
    void printVisitorTest() throws Exception {
        Employee employees = buildOrganisation();
        Visitor printVisitor = new PrintVisitor();

        visitOrganisationStructure(employees, printVisitor);
    }

    //structure of Organisation
    private static Employee buildOrganisation() {
        Programmer programmer1 = new Programmer("Programmer1", "C++");
        Programmer programmer2 = new Programmer("Programmer2", "Java");
        Programmer programmer3 = new Programmer("Programmer3", "PHP");
        Programmer programmer4 = new Programmer("Programmer4", "React");

        ProjectLead projectLead1 = new ProjectLead("projectLead1", programmer1, programmer2);
        ProjectLead projectLead2 = new ProjectLead("projectLead2", programmer3, programmer4);

        Manager manager1 = new Manager("Manager1", projectLead1);
        Manager manager2 = new Manager("Manager2", projectLead2);

        VicePresident vicePresident = new VicePresident("vicePresident", manager1, manager2);
        return vicePresident;
    }

    private static void visitOrganisationStructure(Employee employee, Visitor visitor) {
        employee.accept(visitor);
        employee.getDirectReports().forEach(e -> visitOrganisationStructure(e, visitor));
    }

}
