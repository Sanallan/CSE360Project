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

public class PatientContactController {
	
	//When this method is called, it will changed to the scene to menu page
	@FXML
	public void switchToMenu(ActionEvent event) throws IOException 
	{
		Parent NurseMenuParent = FXMLLoader.load(getClass().getResource("NurseMenu.fxml"));
		Scene NurseMenuScene = new Scene(NurseMenuParent);
				
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(NurseMenuScene);
		window.show();
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

    @FXML
    private TextArea PharmacyArea;

    @FXML
    private Button backToMenuButton;

    @FXML
    private TextArea insuranceArea;

    @FXML
    private Button insuranceUpdateButton;

    @FXML
    private Button logOutButton;

    @FXML
    private TextArea patientInfoArea;

    @FXML
    private Button pharmacyUpdateButton;

    @FXML
    void backToMenu(ActionEvent event) {

    }

    @FXML
    void insuranceUpdate(ActionEvent event) {

    }

    @FXML
    void logOut(ActionEvent event) {

    }

    @FXML
    void pharmacyUpdate(ActionEvent event) {

    }

}