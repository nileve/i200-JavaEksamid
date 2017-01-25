import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
// https://gist.github.com/jewelsea/5603340
// http://www.dreamincode.net/forums/topic/134150-how-to-make-a-random-number-of-circles/
// http://www.dummies.com/programming/java/javafx-how-to-use-property-events/

public class Detektiiv extends Application {
    
    public static void main (String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("LEIA RING");
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        
        Group root = new Group();
        
        Pane pane = new Pane();
        pane.setMaxWidth(400);
        pane.setMaxHeight(400);
        
        int x = new Random().nextInt(350);
        int y = new Random().nextInt(350);
        Circle circle1 = new Circle(x, y, 15, Color.TRANSPARENT);
        x = new Random().nextInt(300);
        y = new Random().nextInt(300);
        Circle circle2 = new Circle(x, y, 75, Color.TRANSPARENT);
        x = new Random().nextInt(250);
        y = new Random().nextInt(250);
        Circle circle3 = new Circle(x, y, 45, Color.TRANSPARENT);
        
        circle1.setOnMouseEntered(event -> {
            circle1.setFill(Color.RED);
        });
        
        circle2.setOnMouseEntered(event -> {
            circle2.setFill(Color.DODGERBLUE);
        });
        
        circle3.setOnMouseEntered(event -> {
            circle3.setFill(Color.GREENYELLOW);
        });
        
        pane.getChildren().add(new Group(circle1, circle2, circle3));
        root.getChildren().addAll(pane);
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}