package org.example;

import javafx.event.ActionEvent;

import java.io.IOException;

public class InstructionsController {
    public void switchToPreGameScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("PreGameScreen");
    }
}
