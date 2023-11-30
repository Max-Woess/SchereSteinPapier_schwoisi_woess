package com.example.ssp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class HelloController {
    public HelloController(){
    }

    //Generates Pick of the Computer
    //1...Rock
    //2...Paper
    //3...Scissor
    public int ComputerPick(){

        return (int)(Math.random() * 3 - 1 + 1) + 1;
    }
    Image backgrnd = new Image("background.png");
    Image paperNol = new Image("PaperNOL.png");
    Image paperOL = new Image("PaperOL.png");
    Image pickNOH = new Image("PickNOH.png");
    Image pickOH = new Image("PickOH.png");
    Image rockNOL = new Image("RockNOL.png");
    Image rockOL = new Image("RockOL.png");
    Image schereNOL = new Image("SchereNOL.png");
    Image schereOL = new Image("SchereOL.png");
    Image wl_loss = new Image("wl_loss.png");
    Image wl_win = new Image("wl_win.png");





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
    ImageView scissoroffimg= new ImageView(schereNOL);
    @FXML
    ImageView scissoronimg =new ImageView(schereOL);
    @FXML
    ImageView rockoffimg = new ImageView(rockNOL);
    @FXML
    ImageView rockonimg = new ImageView(rockOL);
    @FXML
    ImageView paperoffimg = new ImageView(paperNol);
    @FXML
    ImageView paperonimg= new ImageView(paperOL);
    @FXML
    ImageView lossimg= new ImageView(wl_loss);
    @FXML
    ImageView winimg = new ImageView(wl_win);
    @FXML
    ImageView coinimg= new ImageView();


    @FXML
    Label yourpick ;
    @FXML
    Label compick;
    @FXML
    Label coincount;












}

