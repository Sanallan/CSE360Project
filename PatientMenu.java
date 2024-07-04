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

public class PatientMenu {
	
	
	//When this method is called, it will changed to the scene to patient search page
	@FXML
	public void switchToMedHist(ActionEvent event) throws IOException 
	{
		Parent patientSearchParent = FXMLLoader.load(getClass().getResource("MedicalHistoryPatientSide.fxml"));
		Scene patientSearchScene = new Scene(patientSearchParent);
		
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(patientSearchScene);
		window.show();
	}
	
	//When this method is called, it will changed to the scene to patient contact page
	@FXML
	public void switchToSummary(ActionEvent event) throws IOException 
	{
		Parent appointmentSummaryParent = FXMLLoader.load(getClass().getResource("AppointmentSummaryPatienSide.fxml"));
		Scene appointmentSummaryScene = new Scene(appointmentSummaryParent);
				
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(appointmentSummaryScene);
		window.show();
	}
	
	//When this method is called, it will changed to the scene to patient history page
	@FXML
	public void switchToMessage(ActionEvent event) throws IOException 
	{
		Parent messageParent = FXMLLoader.load(getClass().getResource("PatientHistory.fxml"));
		Scene messageScene = new Scene(messageParent);
					
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(messageScene);
		window.show();
	}
	
	//When this method is called, it will changed to the scene to patient history page
	@FXML
	public void switchToContactInfo(ActionEvent event) throws IOException 
	{
		Parent contactInfoParent = FXMLLoader.load(getClass().getResource("Vitals.fxml"));
		Scene contactInfoScene = new Scene(contactInfoParent);
						
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(contactInfoScene);
		window.show();
	}

    @FXML
    private Button inbox;

    @FXML
    private Button logOutButton;

    @FXML
    private Button visitsummary;

    @FXML
    private Button history;

    @FXML
    private Button contactinfo;


    @FXML
    void logOut(ActionEvent event) {

    }

    @FXML
    void inbox(ActionEvent event) {

    }

    @FXML
    void visitsummary(ActionEvent event) {

    }

    @FXML
    void history(ActionEvent event) {
q
    }

    @FXML
    void contactinfo(ActionEvent event) {

    }


}
