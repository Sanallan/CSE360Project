import java.util.ArrayList;
import java.util.List;

public class PatientManager {
    private List<PatientHistoryController> patients = new ArrayList<>();

    public void addPatient(PatientHistoryController patient) {
        patients.add(patient);
    }

    public List<PatientHistoryController> getAllPatients() {
        return patients;
    }
}
