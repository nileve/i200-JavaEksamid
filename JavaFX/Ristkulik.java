import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik extends Application {
    
    public static void main (String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("Ristkülik");
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        
        BorderPane border = new BorderPane();
        
        //Creating a rectangle object
        Rectangle rectangle = new Rectangle(20, 20);
        rectangle.setFill(Color.DODGERBLUE);
        
        border.getChildren().add(new Group(rectangle));
        
        border.setCenter(rectangle);
        
        Slider widthX = new Slider(5, 200, 20);
        widthX.setShowTickLabels(true);
        widthX.setShowTickMarks(true);
        widthX.setMajorTickUnit(15);
        widthX.setMinorTickCount(2);
        widthX.setBlockIncrement(10);
        
        Slider heightY = new Slider(5, 200, 20);
        heightY.setShowTickLabels(true);
        heightY.setShowTickMarks(true);
        heightY.setMajorTickUnit(15);
        heightY.setMinorTickCount(2);
        heightY.setBlockIncrement(10);
        
        Label widthXCaption = new Label("width:");
        Label widthXValue = new Label(Double.toString(widthX.getValue()));
        
        Label heightYCaption = new Label("height:");
        Label heightYValue = new Label(Double.toString(heightY.getHeight()));
        
        widthX.valueProperty().addListener((ov, old_val, new_val) -> {
            rectangle.setWidth(new_val.doubleValue());
            widthXValue.setText(String.format("%.2f", new_val));
        });
        
        heightY.valueProperty().addListener((ov, old_val, new_val) -> {
            rectangle.setHeight(new_val.doubleValue());
            heightYValue.setText(String.format("%.2f", new_val));
        });
        
        VBox topBox = new VBox();
        topBox.getChildren()
              .addAll(widthX, widthXCaption, widthXValue, heightY, heightYCaption, heightYValue);
        border.setTop(topBox);
        
        Scene scene = new Scene(border, 500, 500);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
