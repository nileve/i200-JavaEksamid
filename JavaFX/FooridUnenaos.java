import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */

// https://www.daniweb.com/programming/software-development/threads/447852/drawing-random-shapes
// -on-the-screen
// http://www.dreamincode.net/forums/topic/252503-problem-with-generating-100-random-circles/
// https://initpara.wordpress.com/2010/02/21/learn-javafx-animation-with-example-a-232y3pcqwxodx-44/

public class FooridUnenaos extends Application {
    
    public static void main (String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("PUUDUTA RINGE");
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        
        Group root = new Group();
        
        Pane pane = new Pane();
        pane.setMaxWidth(425);
        pane.setMaxHeight(425);
        
        Random r = new Random();
        int x;
        int y;
        int radius;
        
        for (int i = 0; i < 100; ++i) {
            x = r.nextInt(450);
            y = r.nextInt(450);
            radius = r.nextInt(75);
            Circle circle = new Circle(x, y, radius);
            circle.setFill(Color.RED);
            // circle.setStroke(Color.RED);
            circle.setOnMouseEntered(event -> {
                circle.setFill(Color.YELLOWGREEN);
            });
            pane.getChildren().add(new Group(circle));
        }
        
        root.getChildren().addAll(pane);
        
        Scene scene = new Scene(root, 450, 450);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}