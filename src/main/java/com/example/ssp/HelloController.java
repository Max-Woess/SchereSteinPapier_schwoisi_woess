package com.example.ssp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.util.Scanner;


public class HelloController {

    @FXML
    ImageView scissorsimg;

    @FXML
    ImageView rockimg;

    @FXML
    ImageView paperimg;

    @FXML
    ImageView scissorsimgh;

    @FXML
    ImageView rockimgh;

    @FXML
    ImageView paperimgh;

    @FXML
    ImageView pickimg;
    @FXML
    ImageView pickimgh;


    @FXML
    ImageView lossimg;
    @FXML
    ImageView winimg;

    @FXML
    ImageView backgroundimg;
    @FXML
    Label yourpick;
    @FXML
    Label compick;
    @FXML
    Label coincount;

    int playerPick;
    int rint;
    int coins = 0;


    public void scissorsHover(){
        scissorsimgh.setVisible(true);
        compick.setText("Enemy Pick: ");
    }
    public void scissorsHoverExit(){
        scissorsimgh.setVisible(false);

    }
    public void rockHover(){
        rockimgh.setVisible(true);
        compick.setText("Enemy Pick: ");
    }
    public void rockHoverExit(){
        rockimgh.setVisible(false);
    }

    public void paperHover(){
        paperimgh.setVisible(true);
        compick.setText("Enemy Pick: ");
    }
    public void paperExit(){
        paperimgh.setVisible(false);
    }

    public void pickHover(){
        pickimgh.setVisible(true);
    }
    public void pickHoverExit(){
        pickimgh.setVisible(false);
    }


    public void checkwin(int playerPick) {
        int computerPick = ComputerPick();
        if (playerPick == computerPick) {
            playerD();
        } else if (playerPick == computerPick + 1 || playerPick == computerPick - 2) {
            playerW();
        }else {
            playerL();
        }
    }


    public void resetWinLoss(){
        winimg.setVisible(false);
        lossimg.setVisible(false);
    }


    public void pick(){
        resetWinLoss();
        checkwin(playerPick);
    }
    public void rock(){
        playerPick = 1;
        resetWinLoss();
        yourpick.setText("Your Pick: Rock");
    }
    public void paper(){
        playerPick = 2;
        resetWinLoss();
        yourpick.setText("Your Pick: Paper");
    }
    public void scissors(){
        playerPick = 3;
        resetWinLoss();
        yourpick.setText("Your Pick: Scissors");
    }

    public void playerW() {
        System.out.println("Win!");
        coins++;
        updateCoins();
        winimg.setVisible(true);
    }

    public void playerL() {
        System.out.println("Loss!");
        coins--;
        updateCoins();
        lossimg.setVisible(true);
    }

    public void playerD() {
        System.out.println("Draw!");
        updateCoins();
    }

    public void updateCoins(){
        coincount.setText(String.valueOf(coins));
    }


    public int ComputerPick() {
        //Generates Pick of the Computer
        //1...Rock
        //2...Paper
        //3...Scissor
        rint = (int) (Math.random() * 3 - 1 + 1) + 1;
        switch (rint){
            case 1:
                compick.setText("Enemy Pick: Rock");
                System.out.println("rock");
                break;
            case 2:
                compick.setText("Enemy Pick: Paper");
                System.out.println("paper");
                break;
            case 3:
                compick.setText("Enemy Pick: Scissors");
                System.out.println("scissors");
                break;
        }
        System.out.println(rint);

        return rint;
    }

}


