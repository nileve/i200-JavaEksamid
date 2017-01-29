import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
// https://docs.oracle.com/javafx/2/ui_controls/slider.htm
// http://www.java2s.com/Code/Java/2D-Graphics-GUI/Arcdemonstrationscalemoverotatesheer.htm

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon extends Application {
    
    public static void main (String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("JOON");
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        
        BorderPane border = new BorderPane();
        
        //Creating a line object
        Line line = new Line(40, 0, 0, 0);
        
        line.setStrokeWidth(3);
        line.setStroke(Color.DODGERBLUE);
        
        border.setCenter(line);
        
        Slider scaling = new Slider(5, 400, 35);
        scaling.setShowTickLabels(true);
        scaling.setShowTickMarks(true);
        scaling.setMajorTickUnit(30);
        scaling.setMinorTickCount(5);
        scaling.setBlockIncrement(20);
        
        Label scalingCaption = new Label("Scaling:");
        Label scalingValue = new Label(Double.toString(scaling.getValue()));
        
        scaling.valueProperty().addListener((ov, old_val, new_val) -> {
            line.setStartX(new_val.doubleValue());
            //line.setScaleY(new_val.doubleValue());
            scalingValue.setText(String.format("%.2f", new_val));
        });
        
        VBox topBox = new VBox();
        topBox.getChildren().addAll(scaling, scalingCaption, scalingValue);
        border.setTop(topBox);
        
        Scene scene = new Scene(border, 500, 500);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}