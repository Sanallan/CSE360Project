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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MessagePatientController {
	
	
	//When this method is called, it will changed to the scene to the menu page
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
    private Button backToMenuButton;

    @FXML
    private Button logOutButton;

    @FXML
    private TextArea messageArea;

    @FXML
    private Button sendButton;

    @FXML
    private TextField subjectField;

    @FXML
    void backToMenu(ActionEvent event) {

    }

    @FXML
    void logOut(ActionEvent event) {

    }
    
    @FXML
    void send(ActionEvent event) {
    	
    	String message = messageArea.getText();
        if (message != null && !message.trim().isEmpty()) {
            
            sendMessageToPatient(message);
            messageArea.clear(); 
        }

    }
    
    
    private void sendMessageToPatient(String message) {
      
        System.out.println("Message sent to patient: " + message);
    }



}
