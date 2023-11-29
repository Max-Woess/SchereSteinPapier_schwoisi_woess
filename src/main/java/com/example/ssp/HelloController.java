package com.example.ssp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class HelloController {
    //Generates Pick of the Computer
    //1...Rock
    //2...Paper
    //3...Scissor
    public int ComputerPick(){

        return (int)(Math.random() * 3 - 1 + 1) + 1;
    }






}
