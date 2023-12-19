package com.example.gestioncite_universitaire;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button etatDesChambresButton;

    @FXML
    protected void initialize() {
        // Vous pouvez initialiser des éléments ici si nécessaire.
    }

    @FXML
    private void handleEtatDesChambresButtonClick() {
        try {
            // Charger la vue listeChambre.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("listeChambre.fxml"));
            Parent root = loader.load();

            // Créer une nouvelle scène
            Scene scene = new Scene(root);

            // Obtenir la scène actuelle du bouton et la remplacer par la nouvelle scène
            Stage stage = (Stage) etatDesChambresButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleHomeClick() {
        try {
            // Charger la vue hello-view.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();

            // Créer une nouvelle scène
            Scene scene = new Scene(root);

            // Obtenir la scène actuelle du bouton et la remplacer par la nouvelle scène
            Stage stage = (Stage) etatDesChambresButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
