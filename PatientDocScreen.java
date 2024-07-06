package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class PatientDocScreen extends Application {
	
	
	private Scene sceneMessage, sceneVitals,sceneHistory,sceneContact;
	@Override
	public void start(Stage primaryStage) {
		
		Label title = new Label("Patient:");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        
        Button topRightButton = new Button("Log Out");
       
        
        Button message = new Button("Message Patient");
        message.setOnAction(e -> primaryStage.setScene(sceneMessage));
        Button vitals = new Button("Vitals");
        vitals.setOnAction(e -> primaryStage.setScene(sceneVitals));
        Button history = new Button("Patient History");
        history.setOnAction(e -> primaryStage.setScene(sceneHistory));
        Button contact = new Button("Patient Contact");
        contact.setOnAction(e -> primaryStage.setScene(sceneContact));
        
        HBox buttonsHBox = new HBox(80, message, vitals, history, contact);
        buttonsHBox.setAlignment(Pos.CENTER);
        buttonsHBox.setPadding(new Insets(10)); 
        
        
        
        Button search = new Button("Search Patient");
       

        VBox mainContent = new VBox(10, buttonsHBox );
        mainContent.setAlignment(Pos.CENTER); // Center vertically and horizontally
        mainContent.setPadding(new javafx.geometry.Insets(10));
        
        HBox outerButtons = new HBox(1500);
        outerButtons.getChildren().addAll(search,topRightButton);
        outerButtons.setPadding(new Insets(70)); 
       
        HBox titleHBox = new HBox(10);
        titleHBox.setAlignment(Pos.CENTER);
        titleHBox.getChildren().addAll(title);

        
        VBox outerVBox = new VBox(outerButtons,titleHBox, mainContent);
        VBox.setVgrow(mainContent, javafx.scene.layout.Priority.ALWAYS); // Make the main content take up available space
        outerVBox.setPrefWidth(400); 
        
        

        Scene scene = new Scene(outerVBox, 600, 400); // Increased width to accommodate horizontal layout
        primaryStage.setTitle("Doctor Main Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
