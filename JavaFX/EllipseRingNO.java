import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista Ellipse, mille ringjoone paksust saab kasutaja slideriga muuta.
 */
public class EllipseRingNO extends Application {
    
    public static void main (String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("Ellipse");
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        
        BorderPane border = new BorderPane();
        
        //Creating a ellipse object
        Ellipse ellipse = new Ellipse(45, 45, 30, 45);
        ellipse.setFill(Color.DODGERBLUE);
        ellipse.setStroke(Color.RED);
        ellipse.setStrokeWidth(10);
        
        border.getChildren().add(new Group(ellipse));
        
        border.setCenter(ellipse);
        
        Slider stroke = new Slider(0, 50, 10);
        stroke.setShowTickLabels(true);
        stroke.setShowTickMarks(true);
        stroke.setMajorTickUnit(5);
        stroke.setMinorTickCount(1);
        stroke.setBlockIncrement(5);
        
        Label strokeCaption = new Label("Stroke:");
        Label strokeValue = new Label(Double.toString(stroke.getValue()));
        
        stroke.valueProperty().addListener((ov, old_val, new_val) -> {
            ellipse.setStrokeWidth(new_val.doubleValue());
            //line.setScaleY(new_val.doubleValue());
            strokeValue.setText(String.format("%.2f", new_val));
        });
        
        VBox topBox = new VBox();
        topBox.getChildren().addAll(stroke, strokeCaption, strokeValue);
        border.setTop(topBox);
        
        Scene scene = new Scene(border, 500, 500);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}