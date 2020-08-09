package pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility.client;

import pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility.Director;
import pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility.Employee;
import pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility.LeaveApproval;
import pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility.Manager;
import pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility.ProjectLead;

/**
 * when code sends the request to other code which handles that request - that causes tightly coupling
 * ChainOfResponsibility pattern tries to reduce that coupling by giving more than one object change to process that request
 * we need to create objects which are chained together
 * so the chain is created by one object knowing which is the next object in the chain
 * and that object knows which is the next one etc.
 * so our code does not know which object is providing the functionality, next object provides functionality, then again next etc.
 * if first object in chain cannot handle request then pass request to next object and so on
 * <p>
 * This class represents a request in our chain of responsibility
 */
public class ChainClient {
    private ChainClient() {
    }

    //here we setup chain of responsibility
    public static LeaveApproval createChain() {
        Employee director = new Director("Director", null);
        Employee manager = new Manager("Manager", director);
        Employee projectLead = new ProjectLead("ProjectLead", manager);
        //here we return projectLad -> first object in our chain
        return projectLead;
    }

}
