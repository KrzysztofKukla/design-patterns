package pl.kukla.krzys.designpatterns._3_behavioral._23_mediator.test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import pl.kukla.krzys.designpatterns._3_behavioral._23_mediator.MyLabel;
import pl.kukla.krzys.designpatterns._3_behavioral._23_mediator.MySlider;
import pl.kukla.krzys.designpatterns._3_behavioral._23_mediator.TextBox;
import pl.kukla.krzys.designpatterns._3_behavioral._23_mediator.UIMediator;

/**
 * @author Krzysztof Kukla
 */
public class Client extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        UIMediator uiMediator = new UIMediator();
        TextBox textBox = new TextBox(uiMediator);
        MySlider mySlider = new MySlider(uiMediator);
        MyLabel myLabel = new MyLabel(uiMediator);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.add(myLabel, 0, 0);
        grid.add(mySlider, 0, 1);
        grid.add(textBox, 0, 2);

        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setTitle("Mediator pattern");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
