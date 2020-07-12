package pl.kukla.krzys.designpatterns.behavioral.chain_of_responsibility;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * when code which sends the request to other code which handles that request - that causes tightly coupling
 * ChainOfResponsibility pattern tries to reduce that coupling by giving more than one object change to process that request
 * we need to crate objects which are chained together
 * so the chain is created by one object knowing which is the next object is in the chain
 * and that object knows which is the next one etc.
 * so our code does not which object is providing the functionality, next object provides functionality, then again next etc.
 * if first object in chain cannot handle request then pass request to next object and so on
 * <p>
 * This class represents a request in our chain of responsibility
 */
@Getter
@Setter
@Builder
public class LeaveApplication {

    public int getNoOfDays() {
        // TODO
        throw new UnsupportedOperationException("getNoOfDays() needs to be implemented");
    }

    public enum Type {
        SICK, PTO, LOP
    }

    public enum Status {
        PENDING, APPROVED, REJECTED
    }

    private Type type;
    private Status status;
    private LocalDate from;
    private LocalDate to;

    private String processedBy;

    public LeaveApplication(Type type, Status status, LocalDate from, LocalDate to, String processedBy) {
        this.type = type;
        this.status = status;
        this.from = from;
        this.to = to;
        this.processedBy = processedBy;
    }

    public void approve(String approvalRole) {

    }

}
