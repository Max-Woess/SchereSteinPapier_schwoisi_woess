package com.example.ssp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Test");
    }

    Button button;
    public void initialize (){
        ImageView imageView = new ImageView(getClass().getResource("/com/edencoding/images/EdenCodingIcon.png").toExternalForm());
        button.setGraphic(imageView);
    }
}