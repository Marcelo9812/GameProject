package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LoginScreenController {

    @FXML
    public void switchToPreInstructionScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("PreInstrucionScreen");
    }
}
