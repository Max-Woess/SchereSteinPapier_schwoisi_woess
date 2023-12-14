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
    Button select;
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




    public void scissorsHover(){
        scissorsimgh.setVisible(true);
    }
    public void scissorsHoverExit(){
        scissorsimgh.setVisible(false);
    }
    public void rockHover(){
        rockimgh.setVisible(true);
    }
    public void rockHoverExit(){
        rockimgh.setVisible(false);
    }

    public void paperHover(){
        paperimgh.setVisible(true);
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
            return;
        } else if (playerPick == computerPick + 1 || playerPick == computerPick - 2) {
            playerW();
            return;
        }
        playerL();
        return;
    }



    public void pick(){
        checkwin(playerPick);
    }
    public void rock(){
        playerPick = 1;
    }
    public void paper(){
        playerPick = 2;
    }
    public void scissors(){
        playerPick = 3;
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




    public boolean winCheck() {
        return false;
    }
}


