package pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.domain;

import pl.kukla.krzys.designpatterns._3_behavioral._30_visitor.visitor.Visitor;

/**
 * @author Krzysztof Kukla
 */
public class Programmer extends AbstractEmployee {
    private String skill;

    public Programmer(String name, String skill) {
        super(name);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProgrammer(this);
    }

}
