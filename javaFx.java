import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

class helloWorldFx extends Application {
    public void start(Stage stage) {
        Label message = new Label("First javaFx app");
        message.setFont(new Font(40));

        Button hello = new Button("click me");
        hello.setOnAction(e -> message.setText("hello world app "));
        Button quit = new Button("quit");
        quit.setOnAction(e -> Platform.exit());

        HBox buttonBar = new HBox(20, message, quit);
        buttonBar.setAlignment(Pos.CENTER);
        BorderPane root = new BorderPane();
        root.setCenter(message);
        root.setBottom(buttonBar);

        Scene scene = new Scene(root, 450, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Test");
        stage.show();
    }

}




public class javaFx {
    public static void main(String[] args) {
        Application.launch(args);
    }
}
