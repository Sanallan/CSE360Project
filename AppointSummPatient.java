package application;


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
	
    @FXML
    private Text bodytemp;

    @FXML
    private Text heartrate;

    @FXML
    private Text date;

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
	void back(ActionEvent event) throws IOException 
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuSelectPatient.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
	}

    @FXML
    void earcheck(ActionEvent event) {

    }
    
    @FXML
    void eyecheck(ActionEvent event) {

    }

    @FXML
    void logOut(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
