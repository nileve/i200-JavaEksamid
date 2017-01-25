import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.Random;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application {
    
    public static void main (String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("SALASÕNUM");
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        
        Group root = new Group();
        
        Pane pane = new Pane();
        pane.setMaxWidth(425);
        pane.setMaxHeight(425);
        
        Label label = new Label("Tegelikult on java lahe ...");
        label.setLayoutX(200);
        label.setLayoutY(200);
        label.setTextFill(Color.DODGERBLUE);
        label.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        
        pane.getChildren().add(label);
        
        Random random = new Random();
        int x;
        int y;
        int radius;
        int r;
        int g;
        int b;
        
        for (int i = 0; i < 150; ++i) {
            x = random.nextInt(450);
            y = random.nextInt(450);
            radius = random.nextInt(75);
            r = random.nextInt(255);
            g = random.nextInt(255);
            b = random.nextInt(255);
            Circle circle = new Circle(x, y, radius);
            circle.setFill(Color.rgb(r, g, b));
            // circle.setStroke(Color.RED);
            pane.getChildren().add(circle);
            circle.setOnMouseEntered(event -> {
                // pane.getChildren().remove(circle);
                circle.setFill(Color.TRANSPARENT);
            });
        }
        
        root.getChildren().addAll(pane);
        
        Scene scene = new Scene(root, 450, 450);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}