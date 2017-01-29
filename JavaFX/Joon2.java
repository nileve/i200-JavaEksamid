import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
// https://docs.oracle.com/javafx/2/ui_controls/slider.htm
// http://www.java2s.com/Code/Java/2D-Graphics-GUI/Arcdemonstrationscalemoverotatesheer.htm

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon2 extends Application {
    
    public static void main (String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        
        Kasutajaliides kl = new Kasutajaliides(pane);
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}

class Kasutajaliides {
    
    Pane pane;
    TextField x;
    Button button;
    private int[] jooneKoordinaadid;
    
    public Kasutajaliides (Pane paneSisse) {
        pane = paneSisse;
        looKasutajaliides();
        joonistaJoon();
    }
    
    private void looKasutajaliides () {
        x = new TextField();
        button = new Button("Joonista");
        button.setTranslateX(170);
        button.setDefaultButton(true);
        pane.getChildren().addAll(x, button);
    }
    
    private void joonistaJoon () {
        button.setOnAction(event -> {
            String input = x.getText();
            String[] k = input.split("-");
            jooneKoordinaadid = new int[k.length];
            for (int i = 0; i < k.length; i++) {
                jooneKoordinaadid[i] = Integer.parseInt(k[i]);
            }
            Line line = new Line(jooneKoordinaadid[0], jooneKoordinaadid[1], jooneKoordinaadid[2],
                                 jooneKoordinaadid[3]);
            pane.getChildren().add(line);
        });
    }
    
}

/* GIT:

1- giti link pasteda:
    git clone link
2- cd kaust
3- muudan koodi või teen uusi faile
4- git add . (kõik) või git add /file/source
5- git push

 */