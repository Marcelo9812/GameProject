package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PreInstructionScreenController {

    @FXML
    public void switchToLoginScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("LoginScreen");
    }
    @FXML
    public void switchToInstructions(ActionEvent actionEvent) throws IOException {
        App.setRoot("Instructions");
    }
}