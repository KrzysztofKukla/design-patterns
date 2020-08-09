package pl.kukla.krzys.designpatterns._3_behavioral._25_memento;

/**
 * @author Krzysztof Kukla
 */
//Originator class
//we willl take snapshot of its state
public class WorkflowDesigner {

    private Workflow workflow;

    public Workflow getWorkflow() {
        return workflow;
    }

    //to demonstrate we use the simplest case
    //in real life implementation for getMemento ( restore state ) could be much complicated
    public Memento getMemento() {
        return workflow == null ?
            new Memento() :
            new Memento(workflow.getName(), workflow.getSteps());
    }

    //take a snapshot
    //to demonstrate we use the simplest case
    //in real life implementation for seMemento ( take a state snapshot ) could be much complicated
    public void setMemento(Memento memento) {
        this.workflow = memento.isEmpty() ?
            null : new Workflow(memento.getName(), memento.getSteps());
    }

    public void addSteps(String step) {
        workflow.addStep(step);
    }

    public void removeStep(String step) {
        workflow.removeStep(step);
    }

    public void print() {
        System.out.println(workflow);
    }

    public void createWorkflow(String name) {
        workflow = new Workflow(name);
    }

    //to remember -> simple copying reference will not work, because if somebody change state then its state change in Memento as well
    //we have to make deeper copy - clones of our states
    public class Memento {

        private String name;

        //Strings are immutable
        private String[] steps;

        private Memento() {
        }

        public Memento(String name, String[] steps) {
            this.name = name;
            this.steps = steps;
        }

        private String[] getSteps() {
            return steps;
        }

        private String getName() {
            return name;
        }

        private boolean isEmpty() {
            return this.steps == null && this.name == null;
        }

    }

}
