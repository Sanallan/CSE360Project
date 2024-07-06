package application;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class Docpagecontroller {

    private Button logoutButton;
    private TextField firstNameField;
    private TextField lastNameField;

    private TextField dobField;
    private Button submitButton;
    private Text errorText;
    private List<Patient> patients = new ArrayList<>();

    public Docpagecontroller() {
        // Sample data
        patients.add(new Patient("John", "Doe", "01-01-1990"));
        patients.add(new Patient("Jane", "Smith", "02-02-1985"));
        // Add more sample patients as needed
    }

    @FXML
    void initialize() {
        submitButton.setOnAction(this::handleSubmit);
        logoutButton.setOnAction(this::handleLogout);
    }

    private void handleSubmit(ActionEvent event) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String dob = dobField.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || dob.isEmpty()) {
            errorText.setText("All fields are required.");
            return;
        }

        Patient foundPatient = searchPatient(firstName, lastName, dob);
        if (foundPatient != null) {
            try {
                // Patient found, go to patientdocscreen.fxml
                Parent root = FXMLLoader.load(getClass().getResource("patientdocscreen.fxml"));
                Stage stage = (Stage) submitButton.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
                errorText.setText("Error loading patient screen.");
            }
        } else {
            errorText.setText("Patient not found.");
        }
    }

    private Patient searchPatient(String firstName, String lastName, String dob) {
        for (Patient patient : patients) {
            if (patient.getFirstName().equalsIgnoreCase(firstName) &&
                patient.getLastName().equalsIgnoreCase(lastName) &&
                patient.getDob().equals(dob)) {
                return patient;
            }
        }
        return null;
    }

    private void handleLogout(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
            Stage stage = (Stage) logoutButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            errorText.setText("Error loading login screen.");
        }
    }

    // Define a simple Patient class
    class Patient {
        private String firstName;
        private String lastName;
        private String dob;

        public Patient(String firstName, String lastName, String dob) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.dob = dob;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getDob() {
            return dob;
        }
    }
}