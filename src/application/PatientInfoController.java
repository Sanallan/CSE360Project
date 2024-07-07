package application;

import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PatientInfoController {

    @FXML
    private Button backToMenuButton;

    @FXML
    private TextField emerAddress;

    @FXML
    private TextField emerName;

    @FXML
    private TextField emerPhoneNum;

    @FXML
    private TextField insurFaxNum;

    @FXML
    private TextField insurPhoneNum;

    @FXML
    private TextField insuranceID;

    @FXML
    private TextField insuranceName;

    @FXML
    private Button logOutButton;

    @FXML
    private TextField patientAddress;

    @FXML
    private TextField patientEmail;

    @FXML
    private TextField patientName;

    @FXML
    private TextField patientPhone;

    @FXML
    private TextField pharmAddress;

    @FXML
    private TextField pharmHours;

    @FXML
    private TextField pharmName;

    @FXML
    private TextField pharmPhoneNum;

    @FXML
    private Button updateContactButton;

    @FXML
    private Button updateInsuranceButton;

    @FXML
    private Button updatePharmacyButton;

    @FXML
    void backToMenu(ActionEvent event) throws IOException {
    	Parent PatientMenuParent = FXMLLoader.load(getClass().getResource("PatientMenu.fxml"));
		Scene PatientMenuScene = new Scene(PatientMenuParent);
				
		//This line gets the stage information
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(PatientMenuScene);
		stage.show();
    }

    @FXML
    void logOut(ActionEvent event) throws IOException {
    	Parent logOutParent = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		Scene logOutScene = new Scene(logOutParent);
				
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(logOutScene);
		window.show();
    }

    @FXML
    void updateContact(ActionEvent event) {
    	String fileName = PatientClass.getFileName();
        String pPhone = patientPhone.getText();
        String pAddress = patientAddress.getText();
        String pEmail = patientEmail.getText();
        String emergencyName = emerName.getText();
        String emergencyAddress = emerAddress.getText();
        String emergencyPhoneNum = emerPhoneNum.getText();
        
        try (FileWriter writer = new FileWriter(fileName)) {
        	writer.write("Patient Phone: " + pPhone + "\n");
        	writer.write("Patient Address: " + pAddress + "\n");
        	writer.write("Patiet Email: " + pEmail + "\n");
        	writer.write("Emergency Contact Name: " + emergencyName + "\n");
        	writer.write("Emergency Contact Address: " + emergencyAddress + "\n");
        	writer.write("Emergency Contact Phone: " + emergencyPhoneNum + "\n");

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @FXML
    void updateInsuranceContact(ActionEvent event) {
    	String fileName = PatientClass.getFileName();
    	String insurName = insuranceName.getText();
        String insurID = insuranceID.getText();
        String insurancePhone = insurPhoneNum.getText();
        String insuranceFax = insurFaxNum.getText();
        
        try (FileWriter writer = new FileWriter(fileName)) {
        	writer.write("Insurance Name: " + insurName + "\n");
        	writer.write("Insurance ID: " + insurID + "\n");
        	writer.write("Insurance Phone: " + insurancePhone + "\n");
        	writer.write("Insurance Fax: " + insuranceFax + "\n");
        	
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @FXML
    void updatePharmacy(ActionEvent event) {
    	String fileName = PatientClass.getFileName();
    	String pharmacyName = pharmName.getText();
        String pharmacyPhone = pharmPhoneNum.getText();
        String pharmacyAddress = pharmAddress.getText();
        String pharmacyHours = pharmHours.getText();
        
        try (FileWriter writer = new FileWriter(fileName)) {
        	writer.write("Pharmacy Name: " + pharmacyName + "\n");
        	writer.write("Pharmacy Address: " + pharmacyAddress + "\n");
        	writer.write("Pharmacy Hours: " + pharmacyHours + "\n");
        	writer.write("Pharmacy Phone: " + pharmacyPhone + "\n");
        	
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
