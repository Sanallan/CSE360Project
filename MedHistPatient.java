package application;

import java.awt.TextArea;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MedHistPatient {
	
	//When this method is called, it will changed to the scene to menu page
	@FXML
	public void switchToMenu(ActionEvent event) throws IOException 
	{
		Parent PatientMenuParent = FXMLLoader.load(getClass().getResource("MenuSelectPatient.fxml"));
		Scene PatientMenuScene = new Scene(PatientMenuParent);
				
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(PatientMenuScene);
		window.show();
	}

    @FXML
    private Text ImunizatinMissing;

    @FXML
    private Text allegies;

    @FXML
    private Button backToMenuButton;

    @FXML
    private Text dob;

    @FXML
    private TextArea familyHistoryArea;

    @FXML
    private Text height;

    @FXML
    private Text illiness;

    @FXML
    private CheckBox immunizationCheckBox;

    @FXML
    private Text immunizations;

    @FXML
    private Button logOutButton;

    @FXML
    private Text medications;

    @FXML
    private Text name;

    @FXML
    private TextArea pastCheckInArea;

    @FXML
    private TextArea surgeryArea;

    @FXML
    private Text weight;

    @FXML
    void backToMenu(ActionEvent event) {

    }

    @FXML
    void immunizationCheck(ActionEvent event) {

    }

    @FXML
    void logOut(ActionEvent event) {

    }

}
