package application;

import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
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
    private Button saveButton;

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
    
    @FXML
    void save(ActionEvent event) {
     
    	if (validationInput(dateField, weightField, heightField, heartRateField, bloodPressureField, bodyTempField, respirationRateField, reasonOfVisitArea, medicationPrescribedArea)) {
		        try (
		        	FileWriter writer = new FileWriter("PatientName.txt")) {
		            writer.write("Date: " + dateField.getText() + "\n" +
		                         "Weight: " + weightField.getText() + "\n" +
		                         "Height: " + heightField.getText() + "\n" +
		                         "Heart Rate: " + heartRateField.getText() + "\n" +
		                         "Blood Pressure: " + bloodPressureField.getText() + "\n" +
		                         "Body Temp: " + bodyTempField.getText() + "\n" +
		                         "Respiration Rate: " +  respirationRateField.getText() + "\n" +
		                         "Reason of Visit" + reasonOfVisitArea.getText() + "\n" +
		                         "Medication Prescribed" + medicationPrescribedArea.getText() + "\n");
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        }
		    }
		}

 
	
	//This method checks inputs for correctness
	private static boolean validationInput(TextField date, TextField weight, TextField height, TextField heartRate, TextField bloodPressure, TextField bodyTemp, 
			                               TextField respirationRate, TextArea resonOfVisit, TextArea medicationPrescribed) {
	String datePattern = "\\d{2}/\\d{2}/\\d{4}";
	String vitalsPattern = "\\d+(\\.\\d+)?";
		
	boolean isValid = true;
	
	if(!date.getText().matches(datePattern) || !weight.getText().matches(vitalsPattern) || !height.getText().matches(vitalsPattern) || 
	    !heartRate.getText().matches(vitalsPattern) || !bloodPressure.getText().matches(vitalsPattern) || !bodyTemp.getText().matches(vitalsPattern) ||
	    !respirationRate.getText().matches(vitalsPattern)) {
		showAlert("Invalid Input or Inputs");
		isValid = false;
	} else {
		date.setStyle(null);
		weight.setStyle(null);
		height.setStyle(null);
		heartRate.setStyle(null);
		bloodPressure.setStyle(null);
		bodyTemp.setStyle(null);
		respirationRate.setStyle(null);
	}
	return isValid;
	}
	
	//This method prints a warning if the inputs are entered incorrectly 
	private static void showAlert(String message) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setContentText(message);
		alert.showAndWait();

	}
}

