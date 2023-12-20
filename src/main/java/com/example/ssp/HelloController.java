package com.example.ssp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;
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



    String pathPick = "src/main/resources/sounds/pick.wav";
    File filePick = new File(pathPick);
    javafx.scene.media.Media mediaPick = new javafx.scene.media.Media(filePick.toURI().toString());
    javafx.scene.media.MediaPlayer mediaPlayerPick = new javafx.scene.media.MediaPlayer(mediaPick);


    String pathWin = "src/main/resources/sounds/win.wav";
    File fileWin = new File(pathWin);
    javafx.scene.media.Media mediaWin = new javafx.scene.media.Media(fileWin.toURI().toString());
    javafx.scene.media.MediaPlayer mediaPlayerWin = new javafx.scene.media.MediaPlayer(mediaWin);

    String pathLoss = "src/main/resources/sounds/loss.wav";
    File fileLoss = new File(pathLoss);
    javafx.scene.media.Media mediaLoss = new javafx.scene.media.Media(fileLoss.toURI().toString());
    javafx.scene.media.MediaPlayer mediaPlayerLoss = new javafx.scene.media.MediaPlayer(mediaLoss);

    String pathSelect = "src/main/resources/sounds/rpsselect.wav";
    File fileSelect = new File(pathSelect);
    javafx.scene.media.Media mediaSelect = new javafx.scene.media.Media(fileSelect.toURI().toString());
    javafx.scene.media.MediaPlayer mediaPlayerSelect = new javafx.scene.media.MediaPlayer(mediaSelect);







    void playerSelect(){
        mediaPlayerSelect.setVolume(2.00);
        mediaPlayerSelect.play();
    }




    public void scissorsHover(){
        scissorsimgh.setVisible(true);
        mediaPlayerPick.setVolume(5.00);
        mediaPlayerPick.play();
        compick.setText("Enemy Pick: ");
    }
    public void scissorsHoverExit(){
        scissorsimgh.setVisible(false);
        mediaPlayerLoss.stop();
        mediaPlayerSelect.stop();
        mediaPlayerPick.stop();
    }
    public void rockHover(){
        rockimgh.setVisible(true);
        mediaPlayerPick.setVolume(5.00);
        mediaPlayerPick.play();
        compick.setText("Enemy Pick: ");
    }
    public void rockHoverExit(){
        rockimgh.setVisible(false);
        mediaPlayerLoss.stop();
        mediaPlayerSelect.stop();
        mediaPlayerPick.stop();
    }

    public void paperHover(){
        paperimgh.setVisible(true);
        mediaPlayerPick.setVolume(5.00);
        mediaPlayerPick.play();
        compick.setText("Enemy Pick: ");
    }
    public void paperExit(){
        paperimgh.setVisible(false);
        mediaPlayerPick.stop();
        mediaPlayerPick.stop();
    }

    public void pickHover(){
        mediaPlayerPick.setVolume(5.00);
        mediaPlayerPick.play();
        pickimgh.setVisible(true);
    }
    public void pickHoverExit(){
        pickimgh.setVisible(false);
        mediaPlayerPick.stop();
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
        mediaPlayerWin.stop();
        mediaPlayerLoss.stop();
        winimg.setVisible(false);
        lossimg.setVisible(false);
    }


    public void pick(){
        resetWinLoss();

        checkwin(playerPick);
    }
    public void rock(){
        playerSelect();
        playerPick = 1;
        resetWinLoss();
        yourpick.setText("Your Pick: Rock");
    }
    public void paper(){
        playerSelect();
        playerPick = 2;
        resetWinLoss();
        yourpick.setText("Your Pick: Paper");
    }
    public void scissors(){
        playerSelect();
        playerPick = 3;
        resetWinLoss();
        yourpick.setText("Your Pick: Scissors");
    }

    public void playerW() {
        System.out.println("Win!");
        mediaPlayerWin.setVolume(2.00);
        mediaPlayerWin.play();
        coins++;
        updateCoins();
        winimg.setVisible(true);
    }

    public void playerL() {
        System.out.println("Loss!");
        mediaPlayerLoss.setVolume(10.00);
        mediaPlayerLoss.play();
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


