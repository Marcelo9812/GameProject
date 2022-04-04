package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PreInstructionScreenController {

    @FXML public static Label viewTxt;

    public static void initialize() throws IOException {
        App.setRoot("primary");
    }
}