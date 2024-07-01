//Ryan Flynn, CSE360, Homework 1 5/23/24
package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
        	Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        	Scene scene = new Scene(root);
        	primaryStage.setScene(scene);
        	primaryStage.show();
        } catch(Exception e) {
        	e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
