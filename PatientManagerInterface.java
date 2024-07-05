import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PatientApp extends Application {

    private PatientManager patientManager = new PatientManager();

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));

        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        TextField birthdayField = new TextField(); // Consider using DatePicker for better UX
        TextField contactInfoField = new TextField();
        TextField insuranceInfoField = new TextField();
        TextField pharmacyInfoField = new TextField();

        Button addButton = new Button("Add Patient");
        addButton.setOnAction(e -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            LocalDate birthday = LocalDate.parse(birthdayField.getText());
            String contactInfo = contactInfoField.getText();
            String insuranceInfo = insuranceInfoField.getText();
            String pharmacyInfo = pharmacyInfoField.getText();

            Patient patient = new Patient(firstName, lastName, birthday, contactInfo, insuranceInfo, pharmacyInfo);
            patientManager.addPatient(patient);

            // Clear fields after adding
            firstNameField.clear();
            lastNameField.clear();
            birthdayField.clear();
            contactInfoField.clear();
            insuranceInfoField.clear();
            pharmacyInfoField.clear();
        });

        Label displayLabel = new Label();
        addButton.setOnAction(e -> {
            List<Patient> patients = patientManager.getAllPatients();
            StringBuilder sb = new StringBuilder();
            for (Patient patient : patients) {
                sb.append(patient.getFirstName()).append(", ").append(patient.getLastName()).append("\n");
            }
            displayLabel.setText(sb.toString());
        });

        vbox.getChildren().addAll(firstNameField, lastNameField, birthdayField, contactInfoField, insuranceInfoField, pharmacyInfoField, addButton, displayLabel);

        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
