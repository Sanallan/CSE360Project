package application;

import java.io.IOException;

import application.Docpagecontroller.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MessagingController {
	
private TextArea messageTextArea;
    
    
    private Patient patient;

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    private void handleBackButtonAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("patientDocScreen.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    private void handleSendButtonAction(ActionEvent event) {
        String message = messageTextArea.getText();
        if (message != null && !message.trim().isEmpty()) {
            
            sendMessageToPatient(message);
            messageTextArea.clear(); 
        }
    }
    
    private void sendMessageToPatient(String message) {
      
        System.out.println("Message sent to patient: " + message);
    }
    
    
    

}
