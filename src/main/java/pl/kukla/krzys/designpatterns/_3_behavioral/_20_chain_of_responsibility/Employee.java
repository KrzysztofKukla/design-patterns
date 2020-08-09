package pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility;

/**
 * abstract Handler
 */
public abstract class Employee implements LeaveApproval {

    private final String approvalRole;

    //next object in our chain
    private final LeaveApproval nextApprover;

    protected Employee(String approvalRole, LeaveApproval nextApprover) {
        this.approvalRole = approvalRole;
        this.nextApprover = nextApprover;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        //if process request for current object is not able to request then go to successor ( next object/child in chain )
        if (!processRequest(leaveApplication) && nextApprover != null) {
            nextApprover.processLeaveApplication(leaveApplication);
        }
        //if process request with current object in chain is available then process it
        //processMethod();
    }

    //we can call this method from our employee
    protected abstract boolean processRequest(LeaveApplication leaveApplication);

    @Override
    public String getApprovalRole() {
        return approvalRole;
    }

}
