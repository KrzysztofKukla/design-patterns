package pl.kukla.krzys.designpatterns._3_behavioral._25_memento.command;

import pl.kukla.krzys.designpatterns._3_behavioral._25_memento.WorkflowDesigner;

/**
 * @author Krzysztof Kukla
 */
public class CreateStepCommand extends AbstractWorkflowCommand {
    private final String name;

    public CreateStepCommand(WorkflowDesigner designer, String name) {
        super(designer);
        this.name = name;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.createWorkflow(name);
    }

}
