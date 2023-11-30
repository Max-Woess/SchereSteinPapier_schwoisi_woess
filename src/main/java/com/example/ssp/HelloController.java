package com.example.ssp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;



public class HelloController {
    //Generates Pick of the Computer
    //1...Rock
    //2...Paper
    //3...Scissor
    public int ComputerPick() {

        return (int) (Math.random() * 3 - 1 + 1) + 1;
    }

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


}


