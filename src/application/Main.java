//Ryan Flynn, CSE360, Homework 1 5/23/24
package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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

	Stage window;
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	window = primaryStage;
        window.setTitle("Login Page");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));
        
        Text welcomeTxt = new Text("Please Login");
        welcomeTxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        grid.add(welcomeTxt, 0, 0);
        
        Label lblUser = new Label ("Username");
        grid.add(lblUser, 0, 1);
        
        TextField txtUser = new TextField();
        txtUser.setPromptText("username");
        grid.add(txtUser,  1, 1);
        
        Label lblPass = new Label ("Password");
        grid.add(lblPass,  0, 2);
        
        TextField txtPass = new TextField();
        txtPass.setPromptText("password");
        grid.add(txtPass,  1, 2);
        
        Button loginBtn = new Button("Login");
        grid.add(loginBtn,  1, 3);
        
        Scene scene = new Scene(grid, 500, 500);
        window.setScene(scene);
        window.show();
        
    }
}
