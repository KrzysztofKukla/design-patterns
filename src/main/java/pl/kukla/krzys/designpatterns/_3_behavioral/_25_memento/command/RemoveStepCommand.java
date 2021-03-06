package pl.kukla.krzys.designpatterns._3_behavioral._25_memento.command;

import pl.kukla.krzys.designpatterns._3_behavioral._25_memento.WorkflowDesigner;

/**
 * @author Krzysztof Kukla
 */
public class RemoveStepCommand extends AbstractWorkflowCommand {
    private final String step;

    public RemoveStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.removeStep(step);
    }

}
