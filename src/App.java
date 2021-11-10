
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root =  FXMLLoader.load(App.class.getResource("frame.fxml"));

        primaryStage.setTitle("hello");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}