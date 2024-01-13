package DAYS_97;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class JavaFxUpload extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Upload File Versi JavaFX");

        Button button = new Button("Pilih File");
        button.setOnAction(e -> handleFileUpload(primaryStage));

        VBox vbox = new VBox(button);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void handleFileUpload(Stage primaryStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Pilih File untuk Diunggah");

        File selectedFile = fileChooser.showOpenDialog(primaryStage);

        if (selectedFile != null) {
            System.out.println("File yang dipilih: " + selectedFile.getAbsolutePath());
        } else {
            System.out.println("Pemilihan file dibatalkan.");
        }
    }
}

