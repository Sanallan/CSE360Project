package application;
public class PatientClass {
    static String fileName;

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        PatientClass.fileName = fileName;
    }
}