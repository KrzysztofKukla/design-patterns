package pl.kukla.krzys.designpatterns._3_behavioral._23_mediator;

import javafx.scene.control.TextField;

/**
 * @author Krzysztof Kukla
 */
//when somebody type a value in textBox and we want to tell this textBox about that - ( new value of text )
//we want to tell Mediator about all state changes
public class TextBox extends TextField implements UIControl {
    private final UIMediator uiMediator;

    private boolean mediatedUpdate;

    public TextBox(UIMediator uiMediator) {
        this.uiMediator = uiMediator;
        //default text
        this.setText("textBox");
        //we want to register in Mediator every object
        uiMediator.register(this);
        this.textProperty().addListener((v, o, n) -> {
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
        this.setText(uiControl.getControlValue());
        mediatedUpdate = false;
    }

    @Override
    public String getControlValue() {
        return getText();
    }

    @Override
    public String getControlName() {
        return "Textbox";
    }

}
