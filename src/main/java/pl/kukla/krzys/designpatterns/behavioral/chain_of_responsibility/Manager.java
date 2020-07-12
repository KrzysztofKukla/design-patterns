package pl.kukla.krzys.designpatterns.behavioral.chain_of_responsibility;

/**
 * @author Krzysztof Kukla
 */
public class Manager extends Employee {

    public Manager(String approvalRole, LeaveApproval successor) {
        super(approvalRole, successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        switch (leaveApplication.getType()) {
            case SICK:
                leaveApplication.approve(getApprovalRole());
                return true;
            //Paid time off
            case PTO:
                if (leaveApplication.getNoOfDays() <= 5) {
                    leaveApplication.approve(getApprovalRole());
                    return true;
                }
            default:
                return false;
        }
    }

}
