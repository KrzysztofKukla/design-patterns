package pl.kukla.krzys.designpatterns._3_behavioral._23_mediator;

/**
 * @author Krzysztof Kukla
 */
//abstract colleague
public interface UIControl {
    void controlChange(UIControl uiControl);

    String getControlValue();

    String getControlName();

}
