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

public class Login extends Application {
	
	private TextField txtUser, txtPass;
	private Label lblError;
	private Scene scene1, scene2, scene3, scene4, scene5;
	private VBox vbox1, vbox2;
	private GridPane grid;

	Stage window;
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	window = primaryStage;
        window.setTitle("Login Page");
        
        scene1 = makeSceneOne();
        scene2 = makeSceneTwo();
        scene3 = makeSceneThree();
        scene4 = makeSceneFour();
        scene5 = makeSceneFive();
        
        window.setScene(scene1);
        window.show();
        
        
    }
    
    private Scene makeSceneOne() {
    	
    	grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));
        
        Text welcomeTxt = new Text("Please Login");
        welcomeTxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        grid.add(welcomeTxt, 0, 0);
        
        Label lblUser = new Label ("Username");
        grid.add(lblUser, 0, 1);
        
        txtUser = new TextField();
        txtUser.setPromptText("username");
        grid.add(txtUser,  1, 1);
        
        Label lblPass = new Label ("Password");
        grid.add(lblPass,  0, 2);
        
        txtPass = new TextField();
        txtPass.setPromptText("password");
        grid.add(txtPass,  1, 2);
        
        Button loginBtn = new Button("Login");
        loginBtn.setOnAction(e -> handleLoginBtn());
        grid.add(loginBtn,  1, 3);
        
        lblError = new Label ("");
        grid.add(lblError,  1, 4);
        
        scene1 = new Scene(grid, 500, 500);
        window.setScene(scene1);
        window.show();
        
        return scene1;
    }
    
    private Scene makeSceneTwo() {
    	GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));
        
        Text welcomeTxt = new Text("Doctor Page");
        welcomeTxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        grid.add(welcomeTxt, 0, 0);
        
        Button logoutBtn = new Button("Logout");
        logoutBtn.setOnAction(e -> handleLogoutBtn());
        grid.add(logoutBtn,  0, 1);
        
        scene2 = new Scene(grid, 500, 500);
        window.setScene(scene2);
        window.show();
        
        return scene2;
    }
    
    private Scene makeSceneThree() {
    	GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));
        
        Text welcomeTxt = new Text("Patient Page");
        welcomeTxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        grid.add(welcomeTxt, 0, 0);
        
        Button logoutBtn = new Button("Logout");
        logoutBtn.setOnAction(e -> handleLogoutBtn());
        grid.add(logoutBtn,  0, 1);
        
        scene3 = new Scene(grid, 500, 500);
        window.setScene(scene3);
        window.show();
        
        return scene3;
    }
    
    private Scene makeSceneFour() {
    	GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));
        
        Text welcomeTxt = new Text("Receptionist Page");
        welcomeTxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        grid.add(welcomeTxt, 0, 0);
        
        Button logoutBtn = new Button("Logout");
        logoutBtn.setOnAction(e -> handleLogoutBtn());
        grid.add(logoutBtn,  0, 1);
        
        scene4 = new Scene(grid, 500, 500);
        window.setScene(scene4);
        window.show();
        
        return scene4;
    }
    
    private Scene makeSceneFive() {
    	GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));
        
        Text welcomeTxt = new Text("Technician Page");
        welcomeTxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        grid.add(welcomeTxt, 0, 0);
        
        Button logoutBtn = new Button("Logout");
        logoutBtn.setOnAction(e -> handleLogoutBtn());
        grid.add(logoutBtn,  0, 1);
        
        scene5 = new Scene(grid, 500, 500);
        window.setScene(scene5);
        window.show();
        
        return scene5;
    }
    
    private void handleLoginBtn() {
    	if (txtUser.getText().equals("doctor") && txtPass.getText().equals("pass1")) {
    		switchScenes(scene2);
    	} else if (txtUser.getText().equals("patient") && txtPass.getText().equals("pass2")) {
    		switchScenes(scene3);
    	} else if (txtUser.getText().equals("reception") && txtPass.getText().equals("pass3")) {
    		switchScenes(scene4);
    	} else if (txtUser.getText().equals("technician") && txtPass.getText().equals("pass4")) {
    		switchScenes(scene5);
    	} else {
    		lblError.setText("Error: Try Again");
    	}
    	txtUser.setText("");
    	txtPass.setText("");
    }
    
    private void handleLogoutBtn() {
    	switchScenes(scene1);
    	lblError.setText("");
    }
    
    public void switchScenes(Scene scene) {
    	window.setScene(scene);
    }
}
