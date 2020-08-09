package pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility;

/**
 * it can be interface, abstract class or concrete class as well
 * this represents a handler in chain of responsibility
 * abstract handler
 * if handler is not able to process request then we pass request to next handler ( next approval ) in the chain
 * this logic will be repeated in each handler ( will be call in each handler )
 */
public interface LeaveApproval {
    void processLeaveApplication(LeaveApplication leaveApplication);

    //to find out ( dowiedziec sie ) who processed our leave
    String getApprovalRole();

}
