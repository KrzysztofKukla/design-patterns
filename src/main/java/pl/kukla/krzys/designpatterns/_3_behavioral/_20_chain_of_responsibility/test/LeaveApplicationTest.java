package pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility.LeaveApplication;
import pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility.LeaveApproval;
import pl.kukla.krzys.designpatterns._3_behavioral._20_chain_of_responsibility.client.ChainClient;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Krzysztof Kukla
 */
public class LeaveApplicationTest {

    @Test
    void chainResponsibilityTest() throws Exception {
        LeaveApplication leaveApplication = LeaveApplication.builder()
            .type(LeaveApplication.Type.SICK)
            .from(LocalDate.now())
            .to(LocalDate.of(2020, Month.AUGUST, 10))
            .build();

        LeaveApproval leaveApproval = ChainClient.createChain();
        leaveApproval.processLeaveApplication(leaveApplication);
        System.out.println(leaveApplication);
    }

}
