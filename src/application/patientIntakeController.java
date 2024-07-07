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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class patientIntakeController {
	

    @FXML
    private Button backToSearchbtn;

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
    private TextArea nurseNotesArea;

    @FXML
    private CheckBox over12Check;

    @FXML
    private Button saveBtn;

    @FXML
    private TextField weightTxt;

    @FXML
    void logout(ActionEvent event) throws IOException{
    	Parent logInParent = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		Scene logInScene = new Scene(logInParent);
				
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(logInScene);
		window.show();
    }

    @FXML
    void save(ActionEvent event) throws IOException{
    	String firstName = firstNameTxt.getText();
        String lastName = lastNameTxt.getText();
        String dob = dobTxt.getText();
        String date = dateTxt.getText();
        String weight = weightTxt.getText();
        String height = heightTxt.getText();
        String bodyTemp = bodyTempTxt.getText();
        String heartRate = heartRateTxt.getText();
        String bldPress = bldPressTxt.getText();
        
        //creating file name
        String fileName = firstName + lastName + dob + ".txt";
        
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
    void switchToSearch(ActionEvent event) throws IOException{
    	Parent NurseMenuParent = FXMLLoader.load(getClass().getResource("NurseMenu.fxml"));
		Scene NurseMenuScene = new Scene(NurseMenuParent);
				
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(NurseMenuScene);
		window.show();
    }

}
