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
        if (txtUser.getText().equals("doc") && txtPass.getText().equals("doc1")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("docPage.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if (txtUser.getText().equals("nurse") && txtPass.getText().equals("pat2")){
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("NurseMenu.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if(txtUser.getText().equals("patient") && txtPass.getText().equals("pat3")){
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("patientDocScreen.fxml"));
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