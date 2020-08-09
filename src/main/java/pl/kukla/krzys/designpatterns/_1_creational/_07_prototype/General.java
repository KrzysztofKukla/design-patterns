package pl.kukla.krzys.designpatterns._1_creational._07_prototype;

/**
 * @author Krzysztof Kukla
 */
//don't supporting cloning
public class General extends GameUnit {
    private String state = "idle";

    public void attacking() {
        state = "MoralBoost";
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    public String toString() {
        return "Swordsman" + state + " @" + this.getPosition();
    }

    @Override
    protected void resetState() {
        throw new UnsupportedOperationException("reset() method not supported operation");
    }

}
