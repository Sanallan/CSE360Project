// Patient class to hold patient information:
public class Patient {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String contactInfo;
    private String insuranceInfo;
    private String pharmacyInfo;
    // Add getters and setters as needed

    public Patient(String firstName, String lastName, LocalDate birthday, String contactInfo, String insuranceInfo, String pharmacyInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.contactInfo = contactInfo;
        this.insuranceInfo = insuranceInfo;
        this.pharmacyInfo = pharmacyInfo;
    }
}
