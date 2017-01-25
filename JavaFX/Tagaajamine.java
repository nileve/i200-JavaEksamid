import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
// https://gist.github.com/jewelsea/4569878
public class Tagaajamine extends Application {
    
    public static void main (String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("ÄRRITA RINGI");
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        
        Pane pane = new BorderPane();
        
        //Creating a circle object
        Circle circle = new Circle(45, 45, 40, Color.DODGERBLUE);
        
        pane.getChildren().add(new Group(circle));
        
        circle.setOnMouseEntered(event -> {
            Random r = new Random();
            int x = r.nextInt(450);
            int y = r.nextInt(450);
            circle.setCenterX(x);
            circle.setCenterY(y);
            //pane.getChildren().add(circle);
        });
        
        Scene scene = new Scene(pane, 500, 500);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}