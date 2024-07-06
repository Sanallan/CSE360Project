package application;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;


public class PatientDocController {
	
	private TextField patientNameField;
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void switchToMessaging(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Messaging.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToVitals(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("check-in.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToMedicalHistory(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MedicalHistory.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToPatientContact(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("patientContact.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToLoginPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDocPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("docPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void setPatientName(String patientName) {
        patientNameField.setText(patientName);
    }



}
