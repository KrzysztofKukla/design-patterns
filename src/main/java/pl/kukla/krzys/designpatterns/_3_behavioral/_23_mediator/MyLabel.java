package pl.kukla.krzys.designpatterns._3_behavioral._23_mediator;

import javafx.scene.control.Label;

/**
 * @author Krzysztof Kukla
 */
public class MyLabel extends Label implements UIControl {
    private final UIMediator uiMediator;

    private boolean mediatedUpdate;

    public MyLabel(UIMediator uiMediator) {
        this.uiMediator = uiMediator;
        setMinWidth(100);
        setText("Label");
        //we want to register in Mediator every object
        uiMediator.register(this);
    }

    @Override
    public void controlChange(UIControl uiControl) {
        setText(uiControl.getControlValue());
    }

    @Override
    public String getControlValue() {
        return getText();
    }

    @Override
    public String getControlName() {
        return "Label";
    }

}

