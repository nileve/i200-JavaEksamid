import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 * Joonista ring, mille värvi saab kasutaja muuta
 */
public class Ring extends Application {
    
    public static void main (String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("RING");
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        
        BorderPane border = new BorderPane();
        
        //Creating a circle object
        Circle circle = new Circle(45, 45, 10, Color.DODGERBLUE);
        
        border.getChildren().add(new Group(circle));
        
        border.setCenter(circle);
        
        Slider radius = new Slider(0, 150, 10);
        radius.setShowTickLabels(true);
        radius.setShowTickMarks(true);
        radius.setMajorTickUnit(25);
        radius.setMinorTickCount(4);
        radius.setBlockIncrement(10);
        
        Label radiusCaption = new Label("Radius:");
        Label radiusValue = new Label(Double.toString(radius.getValue()));
        
        radius.valueProperty().addListener((ov, old_val, new_val) -> {
            circle.setRadius(new_val.doubleValue());
            //line.setScaleY(new_val.doubleValue());
            radiusValue.setText(String.format("%.2f", new_val));
        });
        
        VBox topBox = new VBox();
        topBox.getChildren().addAll(radius, radiusCaption, radiusValue);
        border.setTop(topBox);
        
        Scene scene = new Scene(border, 500, 500);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}

// color picker
//public class ColorPickerSample extends Application {
//    private void init(Stage primaryStage) {
//        Group root = new Group();
//        primaryStage.setScene(new Scene(root));
//        final ColorPicker colorPicker = new ColorPicker(Color.GRAY);
//        ToolBar standardToolbar = ToolBarBuilder.create().items(colorPicker).build();
//
//        final Text coloredText = new Text("Colors");
//        Font font = new Font(53);
//        coloredText.setFont(font);
//        final Button coloredButton = new Button("Colored Control");
//        Color c = colorPicker.getValue();
//        coloredText.setFill(c);
//        coloredButton.setStyle(createRGBString(c));
//
//        colorPicker.setOnAction(new EventHandler() {
//
//            public void handle(Event t) {
//                Color newColor = colorPicker.getValue();
//                coloredText.setFill(newColor);
//                coloredButton.setStyle(createRGBString(newColor));
//            }
//        });
//
//        VBox coloredObjectsVBox = VBoxBuilder.create().alignment(Pos.CENTER).spacing(20).children(coloredText, coloredButton).build();
//        VBox outerVBox = VBoxBuilder.create().alignment(Pos.CENTER).spacing(150).padding(new Insets(0, 0, 120, 0)).children(standardToolbar, coloredObjectsVBox).build();
//        root.getChildren().add(outerVBox);
//    }
//
//    private String createRGBString(Color c) {
//        return "-fx-base: rgb(" + (c.getRed() * 255) + "," + (c.getGreen() * 255) + "," + (c.getBlue() * 255) + ");";
//    }
//
//    @Override public void start(Stage primaryStage) throws Exception {
//        init(primaryStage);
//        primaryStage.show();
//    }
//    public static void main(String[] args) { launch(args); }
//}