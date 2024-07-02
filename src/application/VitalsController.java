package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VitalsController {
	
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

    @FXML
    private Button backToMenuButton;

    @FXML
    private TextField bloodPressureField;

    @FXML
    private TextField bodyTempField;

    @FXML
    private TextField dateField;

    @FXML
    private RadioButton earCheckRadioButton;

    @FXML
    private RadioButton eyeCheckRadioButton;

    @FXML
    private TextField heartRateField;

    @FXML
    private TextField heightField;

    @FXML
    private TextArea medicationPrescribedArea;

    @FXML
    private TextArea reasonOfVisitArea;

    @FXML
    private TextField respirationRateField;

    @FXML
    private TextField weightField;

    @FXML
    void backToMenu(ActionEvent event) {

    }

    @FXML
    void earCheck(ActionEvent event) {

    }

    @FXML
    void eyeCheck(ActionEvent event) {

    }

}
