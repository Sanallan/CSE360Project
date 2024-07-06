package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class PatientInfoController {
	
	//When this method is called, it will changed to the scene to menu page
	//@FXML
	/*
	 * public void switchToMenu(ActionEvent event) throws IOException { Parent
	 * PatientMenuParent =
	 * FXMLLoader.load(getClass().getResource("PatientMenu.fxml")); Scene
	 * PatientMenuScene = new Scene(PatientMenuParent);
	 * 
	 * //This line gets the stage information Stage window = (Stage) ((Node)
	 * event.getSource()).getScene().getWindow(); window.setScene(PatientMenuScene);
	 * window.show(); }
	 */

	/*
	 * @FXML public void switchLogOut(ActionEvent event) throws IOException { Parent
	 * logOutParent = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
	 * Scene logOutScene = new Scene(logOutParent);
	 * 
	 * //This line gets the stage information Stage window = (Stage) ((Node)
	 * event.getSource()).getScene().getWindow(); window.setScene(logOutScene);
	 * window.show(); }
	 */

    @FXML
    private TextArea insuranceArea;

    @FXML
    private Button updateInsuranceButton;

    @FXML
    private TextArea patientInfoArea;
    
    @FXML
    private Button updateContactButton;
    
    @FXML
    private TextArea pharmacyArea;

    @FXML
    private Button updatePharmacyButton;
    
    @FXML
    private Button logOutButton;
    
    @FXML
    private Button backToMenuButton;

    
    
    @FXML
    void updateContact(ActionEvent event) {

    }
    
    @FXML
    void updatePharmacy(ActionEvent event) {

    }

    @FXML
    void updateInsurance(ActionEvent event) {

    }
    
    @FXML
    void backToMenu(ActionEvent event) throws IOException {
    	Parent PatientMenuParent = FXMLLoader.load(getClass().getResource("PatientMenu.fxml"));
		Scene PatientMenuScene = new Scene(PatientMenuParent);
				
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(PatientMenuScene);
		window.show();
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


}
