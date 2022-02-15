package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController implements Initializable {
    public Label loginLabel;
    public Label passwordLabel;
    public TextField loginTxtField;
    public TextField passwordTxtField;
    public Button loginButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onLogin(ActionEvent actionEvent) {
    }
}
