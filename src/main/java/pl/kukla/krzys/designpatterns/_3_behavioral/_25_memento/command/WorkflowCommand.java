package pl.kukla.krzys.designpatterns._3_behavioral._25_memento.command;

//Command design pattern
public interface WorkflowCommand {
    void execute();

    //this method will reset what has been done in execute() method
    void undo();

}
