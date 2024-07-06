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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MedHistPatient {
	  @FXML
	    private Text ImunizatinMissing;

	    @FXML
	    private Text allegies;

	    @FXML
	    private Button backToMenuButton;

	    @FXML
	    private Text dob;

	    @FXML
	    private TextArea familyHistoryArea;

	    @FXML
	    private Text height;

	    @FXML
	    private Text illiness;

	    @FXML
	    private CheckBox immunizationCheckBox;

	    @FXML
	    private Text immunizations;

	    @FXML
	    private Button logOutButton;

	    @FXML
	    private Text medications;

	    @FXML
	    private Text name;

	    @FXML
	    private TextArea pastCheckInArea;

	    @FXML
	    private TextArea surgeryArea;

	    @FXML
	    private Text weight;

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
    void immunizationCheck(ActionEvent event) {

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
