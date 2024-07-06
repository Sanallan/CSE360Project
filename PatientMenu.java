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
	
	@FXML
	void medHist(ActionEvent event) throws IOException 
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MedicalHistoryPatientSide.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
	}
	
	@FXML
	void summary(ActionEvent event) throws IOException 
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AppointmentSummaryPatientSide.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
	}
	
	@FXML
	void messages(ActionEvent event) throws IOException 
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("patientmessaging.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
		
	}

	@FXML
	void contactInfo(ActionEvent event) throws IOException 
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("patientInfo.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
		
	}

    @FXML
    void logOut(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
		
    }



}
