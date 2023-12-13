package com.example.ssp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.util.Scanner;


public class HelloController {


    //8 imagviews, 4Buttons, VBox
    @FXML
    VBox vbox;
    @FXML
    Button scissor;
    @FXML
    Button rock;
    @FXML
    Button paper;
    @FXML
    Button win;
    @FXML
    Button lose;
    @FXML
    Button select;
    @FXML
    ImageView scissoroffimg;
    @FXML
    ImageView scissoronimg;
    @FXML
    ImageView rockoffimg;
    @FXML
    ImageView rockonimg;
    @FXML
    ImageView paperoffimg;
    @FXML
    ImageView paperonimg;
    @FXML
    ImageView lossimg;
    @FXML
    ImageView winimg;
    @FXML
    ImageView coinimg;
    @FXML
    ImageView backgroundimg;
    @FXML
    Label yourpick;
    @FXML
    Label compick;
    @FXML
    Label coincount;


    public void main(){
        gameLoop();
    }

    public void gameLoop() {
        int p = 0;
        int pcp;

        do {
            p = playerPick();
            pcp = ComputerPick();
            checkWin(p, pcp);
        } while (p != 0);
        System.out.println("exiting....");


    }

    public int checkWin(int playerPick, int computerPick) {
        // 10 PlayerWin
        // 20 PlayerLoss
        // 30 Draw
        if (playerPick == computerPick) {
            playerD();
            return 30;
        } else if (playerPick == computerPick + 1 || playerPick == computerPick - 2) {
            playerW();
            return 10;
        }
        playerL();
        return 20;
    }

    public void playerW() {
        System.out.println("Win!");
    }

    public void playerL() {
        System.out.println("Loss!");
    }

    public void playerD() {
        System.out.println("Draw!");
    }

    public int ComputerPick() {
        //Generates Pick of the Computer
        //1...Rock
        //2...Paper
        //3...Scissor
        int rint = (int) (Math.random() * 3 - 1 + 1) + 1;
        System.out.println(rint);

        return rint;
    }


    public int playerPick() {
        String pick = "null";
        Scanner scanner = new Scanner(System.in);

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

        switch (pick) {
            case "rock":
                System.out.println(1);
                return 1;
            case "paper":
                System.out.println(2);
                return 2;
            case "scissors":
                System.out.println(3);
                return 3;
            case "exit":
                return 0;
            default:
                System.out.println("Invalid input!");
        }
        return 4;
    }


    public boolean winCheck() {
        return false;
    }
}


