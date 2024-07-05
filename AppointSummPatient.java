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
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;

public class AppointSummPatient {
	
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
    private Text bodytemp;

    @FXML
    private Text heartrate;

    @FXML
    private Button bloodpress;

    @FXML
    private Text date;

    @FXML
    private TextArea respirrate;

    @FXML
    private Text height;

    @FXML
    private Text weight;

    @FXML
    private RadioButton eyecheck;
    
    @FXML
    private RadioButton earcheck;

    @FXML
    private Text immunizations;

    @FXML
    private Button logOutButton;
    
    @FXML
    private TextArea medicationprescr;
    
    @FXML
    private TextArea reasonofvisit;
    
    @FXML
    private TextArea listofprevappoints;

    @FXML
    void backToMenu(ActionEvent event) {

    }

    @FXML
    void earcheck(ActionEvent event) {

    }
    
    @FXML
    void eyecheck(ActionEvent event) {

    }

    @FXML
    void logOut(ActionEvent event) {

    }

}
