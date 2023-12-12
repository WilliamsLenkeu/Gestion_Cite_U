package com.example.gestioncite_universitaire;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private ToggleButton toggleButton;

    @FXML
    private void onToggleThemeButtonClick() {
        if (toggleButton.isSelected()) {
            welcomeText.setStyle("-fx-text-fill: white; -fx-background-color: darkgray;");
        } else {
            welcomeText.setStyle("-fx-text-fill: black; -fx-background-color: lightgray;");
        }
    }
}