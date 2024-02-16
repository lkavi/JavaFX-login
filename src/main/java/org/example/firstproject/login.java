package org.example.firstproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class login {

    @FXML
    private Button signinbutton;
    @FXML
    private Label wrongcredentials;
    @FXML
    private TextField usernameinput;
    @FXML
    private PasswordField passwordinput;

    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();

    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if(usernameinput.getText().toString().equals("javacoding") && passwordinput.getText().toString().equals("123")) {
            wrongcredentials.setText("Success!");

            m.changeScene("afterLogin.fxml");
        }

        else if(usernameinput.getText().isEmpty() && passwordinput.getText().isEmpty()) {
            wrongcredentials.setText("Please enter your data.");
        }


        else {
            wrongcredentials.setText("Wrong credentials!");
        }
    }
}

