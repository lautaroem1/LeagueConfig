package app.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;


public class UIController implements Initializable {

    @FXML
    private Button settings;

    @FXML
    private ChoiceBox<?> language;

    @FXML
    private ChoiceBox<?> server;

    @FXML
    private Button save;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Initialized controller");
    }
}