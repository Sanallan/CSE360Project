package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Docpagecontroller {

    @FXML
    private Button btnLogin;

    @FXML
    private TextField dobTxt;

    @FXML
    private TextField firstNameTxt;

    @FXML
    private TextField lastNameTxt;

    @FXML
    private Button logoutBtn;

    public void btnLogin(ActionEvent event) throws IOException{
    	String firstName = firstNameTxt.getText();
		String lastName = lastNameTxt.getText();
		String dob = dobTxt.getText();
		if (firstName.isEmpty() || lastName.isEmpty() || dob.isEmpty()) {
            showAlert(AlertType.ERROR, "Error", "Please Enter Required Fields");
            return;
        }
		// Creating the file name
        String fileName = firstName + lastName + dob + ".txt";
        PatientClass.fileName = (fileName);
        Path filePath = Paths.get(fileName);
        
        if (Files.exists(filePath)) {
			Parent vitalsParent = FXMLLoader.load(getClass().getResource("patientDocScreen.fxml"));
			Scene vitalsScene = new Scene(vitalsParent);
							
			//This line gets the stage information
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(vitalsScene);
			window.show();
        } else {
        	showAlert(AlertType.ERROR, "Error", "Patient File Not Found.");
        }
    }
    
    @FXML
	void logoutBtn(ActionEvent event) throws IOException 
	{
		Parent logInParent = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		Scene logInScene = new Scene(logInParent);
				
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(logInScene);
		window.show();
	}
    
    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
