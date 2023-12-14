package com.example.ssp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.channels.Pipe;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);

        stage.setTitle("Schere-Stein-Papier");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

        HelloController c = fxmlLoader.getController();


    }

    public static void main(String[] args) {
        launch();


    }


}


