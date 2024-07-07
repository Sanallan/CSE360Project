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

public class PatientMessengerController {
	
	
	//When this method is called, it will changed to the scene to menu page


	@FXML
    private TextField docNameField;
	
	@FXML
    private TextField subjectField;

    @FXML
    private TextArea messageArea;

    @FXML
    private Button sendButton;
    
    @FXML
    private Button backToMenuButton;

    @FXML
    private Button logOutButton;

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

    @FXML
    void send(ActionEvent event) {
    	String message = messageArea.getText();
        if (message != null && !message.trim().isEmpty()) {
            
            sendMessageToDoctor(message);
            messageArea.clear(); 
        }
    }
    
    private void sendMessageToDoctor(String message) {
        
        System.out.println("Message sent to patient: " + message);
    }

}
