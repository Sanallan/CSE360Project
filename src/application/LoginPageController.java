package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginPageController {

    @FXML
    private Label lblError;

    @FXML
    private TextField txtPass;

    @FXML
    private TextField txtUser;
    
    @FXML
    void btnLogin(ActionEvent event) throws IOException{
        String username = txtUser.getText();
        if (txtUser.getText().equals("developer") && txtPass.getText().equals("dev1") 
        || txtUser.getText().equals("supervisor") && txtPass.getText().equals("sup2") 
        || txtUser.getText().equals("engineer") && txtPass.getText().equals("engi3")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("docPage.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if (txtUser.getText().isEmpty() && txtPass.getText().isEmpty()) {
            lblError.setText("Please enter a username and password");
        } else {
            lblError.setText("Invalid username or password");
        }

    }

}