package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class NurseMenuController {
	
	
	//When this method is called, it will changed to the scene to patient search page
	@FXML
	public void switchToPatientSearch(ActionEvent event) throws IOException 
	{
		Parent patientSearchParent = FXMLLoader.load(getClass().getResource("PatientSearch.fxml"));
		Scene patientSearchScene = new Scene(patientSearchParent);
		
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(patientSearchScene);
		window.show();
	}
	
	//When this method is called, it will changed to the scene to message patient page
	@FXML
	public void switchToMessagePatient(ActionEvent event) throws IOException 
	{
		Parent messagePatientParent = FXMLLoader.load(getClass().getResource("MessagePatient.fxml"));
		Scene messagePatientScene = new Scene(messagePatientParent);
			
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(messagePatientScene);
		window.show();
	}
	
	//When this method is called, it will changed to the scene to patient contact page
	@FXML
	public void switchToPatientContact(ActionEvent event) throws IOException 
	{
		Parent patientContactParent = FXMLLoader.load(getClass().getResource("PatientContact.fxml"));
		Scene patientContactScene = new Scene(patientContactParent);
				
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(patientContactScene);
		window.show();
	}
	
	//When this method is called, it will changed to the scene to patient history page
	@FXML
	public void switchToPatientHistory(ActionEvent event) throws IOException 
	{
		Parent patientHistoryParent = FXMLLoader.load(getClass().getResource("PatientHistory.fxml"));
		Scene patientHistoryScene = new Scene(patientHistoryParent);
					
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(patientHistoryScene);
		window.show();
	}
	
	//When this method is called, it will changed to the scene to patient history page
	@FXML
	public void switchToVitals(ActionEvent event) throws IOException 
	{
		Parent vitalsParent = FXMLLoader.load(getClass().getResource("Vitals.fxml"));
		Scene vitalsScene = new Scene(vitalsParent);
						
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(vitalsScene);
		window.show();
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

    @FXML
    void logOut(ActionEvent event) {

    }

    @FXML
    void messagePatient(ActionEvent event) {

    }

    @FXML
    void patientContact(ActionEvent event) {

    }

    @FXML
    void patientHistory(ActionEvent event) {

    }

    @FXML
    void searchPatient(ActionEvent event) {

    }

    @FXML
    void vitals(ActionEvent event) {

    }

}
