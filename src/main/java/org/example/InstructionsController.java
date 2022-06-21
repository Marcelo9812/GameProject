package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class InstructionsController {

    @FXML
    public void switchToPreGameScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("PreGameScreen");
    }
}
