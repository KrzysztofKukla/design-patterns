package pl.kukla.krzys.designpatterns.behavioral.chain_of_responsibility;

/**
 * concrete Handler
 */
public class Director extends Employee {

    public Director(String approvalRole, LeaveApproval successor) {
        super(approvalRole, successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.getType() == LeaveApplication.Type.PTO) {
            leaveApplication.approve(getApprovalRole());
            return true;
        }
        return false;
    }

}
