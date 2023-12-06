package com.example.ssp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
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
        int choice = playerPick();
    }

    public static void main(String[] args) {
        launch();





    }

    public int playerPick(){
        String pick = "0";
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("--------------------------------------------------------------------");
            System.out.println("THIS IS A TEST FUNCTION - THIS DOES NOT REPLICATE THE FINAL GAME");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Chose the pick you want and type out one of the following commands: ");
            System.out.println(" -- 'rock' -- ");
            System.out.println(" -- 'paper' -- ");
            System.out.println(" -- 'scissors' -- ");
            System.out.println(" -- 'exit' -- ");
            System.out.println(":");
            pick = scanner.nextLine();
            switch (pick){
                case "rock":
                    System.out.println(1);
                    return 1;
                case "paper":
                    System.out.println(2);
                    return 2;
                case "scissors":
                    System.out.println(3);
                    return 3;
            }
        }while(pick != "exit");
        return 0;
    }
}