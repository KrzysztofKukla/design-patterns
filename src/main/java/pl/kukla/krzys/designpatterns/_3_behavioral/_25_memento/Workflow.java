package pl.kukla.krzys.designpatterns._3_behavioral._25_memento;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Krzysztof Kukla
 */
//workflow represents sequence of steps need to be followed in order to complete business process
public class Workflow {
    private final String name;
    private final LinkedList<String> steps;

    public Workflow(String name) {
        this.name = name;
        this.steps = new LinkedList<>();
    }

    public Workflow(String name, String... steps) {
        this.name = name;
        this.steps = new LinkedList<>();
        if (steps != null && steps.length > 0) {
            Arrays.stream(steps)
                .forEach(s -> this.steps.add(s));
        }
    }

    public String getName() {
        return name;
    }

    public String[] getSteps() {
        return steps.toArray(new String[0]);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Workflow->");
        this.steps
            .forEach(step -> sb.append("-> " + step));
        return sb.toString();
    }

    public void addStep(String step) {
        steps.add(step);
    }

    public void removeStep(String step) {
        steps.remove(step);
    }

}
