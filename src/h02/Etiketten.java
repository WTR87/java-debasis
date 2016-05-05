package h02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Etiketten extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("etiketten.fxml"));
        primaryStage.setTitle("Etikettencalculator");
        primaryStage.setScene(new Scene(root, 350, 250));
        primaryStage.show();
    }

    public static void main( String[ ] args)
    {
        launch(args);
    }
}
