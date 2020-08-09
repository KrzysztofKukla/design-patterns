package pl.kukla.krzys.designpatterns._3_behavioral._25_memento.command;

import pl.kukla.krzys.designpatterns._3_behavioral._25_memento.WorkflowDesigner;

/**
 * @author Krzysztof Kukla
 */
public abstract class AbstractWorkflowCommand implements WorkflowCommand {
    protected WorkflowDesigner.Memento memento;
    protected WorkflowDesigner receiver;

    public AbstractWorkflowCommand(WorkflowDesigner designer) {
        this.receiver = designer;
    }

    @Override
    public void undo() {
        receiver.setMemento(memento);
    }

}
