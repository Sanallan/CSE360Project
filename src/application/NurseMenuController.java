package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.Node;

public class NurseMenuController {
	
	@FXML
    private TextField dobField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

	
	//When this method is called, it will changed to the scene to patient search page
	@FXML
	public void switchToPatientSearch(ActionEvent event) throws IOException 
	{
		Parent patientSearchParent = FXMLLoader.load(getClass().getResource("PatientSearch_NurseView.fxml"));
		Scene patientSearchScene = new Scene(patientSearchParent);
		
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(patientSearchScene);
		window.show();
	}
	
	//When this method is called, it will changed to the scene to patient history page
	@FXML
	public void switchToVitals(ActionEvent event) throws IOException 
	{
		Parent vitalsParent = FXMLLoader.load(getClass().getResource("PatientIntakeNew.fxml"));
		Scene vitalsScene = new Scene(vitalsParent);
						
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(vitalsScene);
		window.show();
	}
	
	@FXML
    void searchPatient(ActionEvent event) throws IOException {
		String firstName = firstNameField.getText();
		String lastName = lastNameField.getText();
		String dob = dobField.getText();
		if (firstName.isEmpty() || lastName.isEmpty() || dob.isEmpty()) {
            showAlert(AlertType.ERROR, "Error", "Please Enter Required Fields");
            return;
        }
		// Creating the file name
		
        String fileName = firstName + lastName + dob + ".txt";
        PatientClass.fileName = (fileName);
        Path filePath = Paths.get(fileName);
        
        if (Files.exists(filePath)) {
			Parent vitalsParent = FXMLLoader.load(getClass().getResource("Vitals.fxml"));
			Scene vitalsScene = new Scene(vitalsParent);
							
			//This line gets the stage information
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(vitalsScene);
			window.show();
        } else {
        	showAlert(AlertType.ERROR, "Error", "Patient File Not Found.");
        }
    }
	
	//When this method is called, it will changed to the scene to the log in page
		@FXML
		public void switchToLogIn(ActionEvent event) throws IOException 
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
		
		

    @FXML
    private Button backToSearchButton;

    @FXML
    private Button logOutButton;

    @FXML
    private Button messagePatientButton;

    @FXML
    private Button patientContactButton;

    @FXML
    private Button patientHistoryButton;

    @FXML
    private Button vitalsButton;

    
}
