package pl.kukla.krzys.designpatterns._3_behavioral._23_mediator;

import javafx.scene.control.Slider;

/**
 * @author Krzysztof Kukla
 */
public class MySlider extends Slider implements UIControl {
    private final UIMediator uiMediator;

    private boolean mediatedUpdate;

    public MySlider(UIMediator uiMediator) {
        this.uiMediator = uiMediator;
        setMin(0);
        setMax(50);
        setBlockIncrement(5);
        //we want to register in Mediator every object
        uiMediator.register(this);
        //adding listener on textProperty/textBox means if user will change value in textBox then call listener
        this.valueProperty().addListener((v, o, n) -> {
            //adding listener on textProperty/textBox means if user will change value in textBox then call listener
            if (!mediatedUpdate) {
                //call this code if user change textBox and tell mediator: my state has been changed
                this.uiMediator.valueChanged(this);
            }
        });
    }

    @Override
    public void controlChange(UIControl uiControl) {
        mediatedUpdate = true;
        //notify mediator about change state of this TextBox
        setValue(Double.parseDouble(uiControl.getControlValue()));
        mediatedUpdate = false;
    }

    @Override
    public String getControlValue() {
        return "Slider";
    }

    @Override
    public String getControlName() {
        return "Textbox";
    }

}
