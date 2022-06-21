package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class PreGameScreenController {

    @FXML
    public void switchToFirstElementQuestion(ActionEvent actionEvent) throws IOException {
        App.setRoot("FirstElementQuestion");
    }
}
