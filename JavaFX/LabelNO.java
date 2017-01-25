import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Loo LabelNO, mille sisu saab kasutaja TextFieldi kaudu muuta.
 */
public class LabelNO extends Application {
    
    public static void main (String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("LABEL");
        primaryStage.setMaxWidth(500);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(500);
        
        BorderPane border = new BorderPane();
        
        Label input = new Label("Sisesta oma üllas mõte siia (ja vajuta 'Enter'): ");
        TextField inputField = new TextField("mõtle enne kui kirjutama hakkad ... ");
        inputField.setPrefWidth(300);
        
        Label output = new Label("Sinu sisestatud tekst: ");
        TextArea outputArea = new TextArea(
                "Kui sinu mõte siia ei ilmu, siis järelikult teed midagi valesti või on sul " +
                "halb mõte.");
        outputArea.setPrefHeight(300);
        outputArea.setPrefWidth(300);
        outputArea.setWrapText(true);
        outputArea.setEditable(true);
        
        inputField.setOnAction(event -> {
            String text = inputField.getText();
            outputArea.appendText("\n" + text);
            inputField.selectAll();
        });
        
        VBox centerBox = new VBox();
        centerBox.setLayoutX(10);
        centerBox.setLayoutY(10);
        centerBox.setPrefHeight(250);
        centerBox.setPrefWidth(250);
        centerBox.setSpacing(10);
        
        centerBox.getChildren().addAll(input, inputField, output, outputArea);
        border.setCenter(centerBox);
        
        Scene scene = new Scene(border, 475, 475);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
