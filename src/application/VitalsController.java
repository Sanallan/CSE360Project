package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
    private TextField bldPressTxt;

    @FXML
    private TextField bodyTempTxt;

    @FXML
    private TextField dateTxt;

    @FXML
    private TextField dobTxt;

    @FXML
    private TextField firstNameTxt;

    @FXML
    private TextField heartRateTxt;

    @FXML
    private TextField heightTxt;

    @FXML
    private TextField lastNameTxt;

    @FXML
    private Button logoutBtn;

    @FXML
    private TextArea nurseArea;

    @FXML
    private Button patHistoryBtn;

    @FXML
    private Button saveButton;

    @FXML
    private TextField weightTxt;
    
    @FXML
    void save(ActionEvent event) throws IOException{
    	String fileName = PatientClass.getFileName();
    	String firstName = firstNameTxt.getText();
        String lastName = lastNameTxt.getText();
        String dob = dobTxt.getText();
        String date = dateTxt.getText();
        String weight = weightTxt.getText();
        String height = heightTxt.getText();
        String bodyTemp = bodyTempTxt.getText();
        String heartRate = heartRateTxt.getText();
        String bldPress = bldPressTxt.getText();
        
        //write patient information to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("First Name: " + firstName + "\n");
            writer.write("Last Name: " + lastName + "\n");
            writer.write("DOB: " + dob + "\n");
            writer.write("Date: " + date + "\n");
            writer.write("Weight: " + weight + "\n");
            writer.write("Height: " + height + "\n");
            writer.write("Body Temp: " + bodyTemp + "\n");
            writer.write("Heart Rate: " + heartRate + "\n");
            writer.write("Blood Pressure: " + bldPress + "\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
	}
    
    @FXML
    public void initialize() {
        try {
            loadPatientData();
        } catch (IOException e) {
        	showAlert(AlertType.ERROR, "Error", "Failed To Load Patient Data");
        }
    }

    private void loadPatientData() throws IOException {
        // Get the file name from the shared data class
        String fileName = PatientClass.getFileName();
        Path filePath = Paths.get(fileName);

        // Check if the file exists
        if (Files.exists(filePath)) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                	if (line.startsWith("First Name:")) {
                        firstNameTxt.setText(line.split(": ")[1]);
                    } else if (line.startsWith("Last Name:")) {
                        lastNameTxt.setText(line.split(": ")[1]);
                    } else if (line.startsWith("DOB:")) {
                        dobTxt.setText(line.split(": ")[1]);
                    } else if (line.startsWith("Date:")) {
                        weightTxt.setText(line.split(": ")[1]);
                    } else if (line.startsWith("Weight:")) {
                        heightTxt.setText(line.split(": ")[1]);
                    } else if (line.startsWith("Height:")) {
                        bodyTempTxt.setText(line.split(": ")[1]);
                    } else if (line.startsWith("Body Temp:")) {
                        heartRateTxt.setText(line.split(": ")[1]);
                    } else if (line.startsWith("Heart Rate:")) {
                        bodyTempTxt.setText(line.split(": ")[1]);
                    }  else if (line.startsWith("Blood Pressure:")) {
                        bldPressTxt.setText(line.split(": ")[1]);
                    }
                }
            }
        } else {
        	showAlert(AlertType.ERROR, "Error", "Patient File Not Found.");
        }
    }
    
    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
	

}

