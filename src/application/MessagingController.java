package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MessagingController {

    @FXML
    private Button backBtn;

    @FXML
    void backBtn(ActionEvent event) throws IOException{
    	Parent vitalsParent = FXMLLoader.load(getClass().getResource("patientDocScreen.fxml"));
		Scene vitalsScene = new Scene(vitalsParent);
						
		//This line gets the stage information
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(vitalsScene);
		window.show();
    }

}
