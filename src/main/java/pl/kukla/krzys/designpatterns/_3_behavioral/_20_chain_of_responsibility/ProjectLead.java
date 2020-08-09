package pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility;

/**
 * concrete Handler
 */
public class ProjectLead extends Employee {

    public ProjectLead(String approvalRole, LeaveApproval successor) {
        super(approvalRole, successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        //this ProjectLead class is able to process only if type of leave is sick & duration is less than or equal to 2 days
        if (leaveApplication.getType() == LeaveApplication.Type.SICK) {
            if (leaveApplication.getNoOfDays() <= 2) {
                //then approve for leave
                leaveApplication.approve(getApprovalRole());
                return true;
            }
        }
        return false;
    }

}
