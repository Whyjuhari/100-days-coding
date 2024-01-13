package DAYS_96;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxGui extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Contoh JavaFX");

        Label label = new Label("Halo, JavaFX!");

        Button tombol = new Button("Klik Saya");
        tombol.setOnAction(e -> label.setText("Tombol telah diklik!"));

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(label, tombol);

        Scene scene = new Scene(stackPane, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
