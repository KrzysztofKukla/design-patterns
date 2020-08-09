package pl.kukla.krzys.designpatterns._3_behavioral._25_memento.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._3_behavioral._25_memento.WorkflowDesigner;
import pl.kukla.krzys.designpatterns._3_behavioral._25_memento.command.AddStepCommand;
import pl.kukla.krzys.designpatterns._3_behavioral._25_memento.command.CreateStepCommand;
import pl.kukla.krzys.designpatterns._3_behavioral._25_memento.command.WorkflowCommand;

import java.util.LinkedList;

/**
 * @author Krzysztof Kukla
 */
public class MementoTest {
    @Test
    void mementoTest() throws Exception {
        WorkflowDesigner designer = new WorkflowDesigner();
        LinkedList<WorkflowCommand> commands = runCommands(designer);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);

    }

    private void undoLastCommand(LinkedList<WorkflowCommand> commands) {
        if (!commands.isEmpty()) {
            commands.removeLast().undo();
        }
    }

    private LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer) {
        LinkedList<WorkflowCommand> commands = new LinkedList<>();
        WorkflowCommand command = new CreateStepCommand(designer, "CreateCommand");
        commands.addLast(command);
        command.execute();

        command = new AddStepCommand(designer, "AddCommand first");
        commands.addLast(command);
        command.execute();

        command = new AddStepCommand(designer, "AddCommand second");
        commands.addLast(command);
        command.execute();

        command = new AddStepCommand(designer, "AddCommand thord");
        commands.addLast(command);
        command.execute();

        return commands;
    }

}
