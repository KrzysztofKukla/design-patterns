package pl.kukla.krzys.designpatterns._2_structural._17_flyweight;

import java.time.Duration;

/**
 * @author Krzysztof Kukla
 */
//Unshared concrete of Flyweight
//object of this class cannot be shared
public class UserBannedErrorMessage implements ErrorMessage {
    private String caseId;
    private String remarks;
    private Duration banDuration;
    private String msg;

    public UserBannedErrorMessage(String caseId) {
        this.caseId = caseId;
        remarks = "remarks";
        banDuration = Duration.ofDays(2);
        StringBuilder sb = new StringBuilder();
        sb.append(caseId);
        sb.append(remarks);
        sb.append(banDuration.toHours());
        msg = sb.toString();
    }

    @Override
    public String getText(String code) {
        return msg;
    }

}
