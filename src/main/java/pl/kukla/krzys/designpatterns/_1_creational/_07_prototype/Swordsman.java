package pl.kukla.krzys.designpatterns._1_creational._07_prototype;

/**
 * @author Krzysztof Kukla
 */
public class Swordsman extends GameUnit {
    private String state = "idle";

    public void attack() {
        state = "attack";
    }

    @Override
    public String toString() {
        return "Swordsman " + state + " @" + this.getPosition();
    }

    @Override
    protected void resetState() {
        this.state = "idle";
    }

}
