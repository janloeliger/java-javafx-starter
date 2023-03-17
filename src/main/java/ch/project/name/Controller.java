package ch.project.name;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label messageLabel;

    @FXML
    public void onButtonClick() {
        messageLabel.setText("Hello, World!");
    }
}