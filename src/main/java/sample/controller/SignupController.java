package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import sample.Database.DatabaseHandler;

import java.net.URL;
import java.util.ResourceBundle;

public class SignupController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button signUpButton;

    @FXML
    private CheckBox signUpCheckboxFemale;

    @FXML
    private CheckBox signUpCheckboxMale;

    @FXML
    private TextField signUpFirstName;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpLocation;

    @FXML
    private TextField signUpPassword;

    @FXML
    private TextField signUpUsername;

    @FXML
    void initialize() {

        DatabaseHandler databaseHandler = new DatabaseHandler();

        signUpButton.setOnAction(event -> {

            databaseHandler.signUpUser(signUpFirstName.getText(), signUpLastName.getText(),
                    signUpUsername.getText(), signUpPassword.getText(),
                    signUpLocation.getText(), "Female");

        });


    }

}
