import java.util.Stack;

public class MedicalRecordStack {
    private Stack<MedicalRecord> records;

    MedicalRecordStack() {
        records = new Stack<>();
    }

    void addRecord(String patientName, String recordDetails) {
        records.push(new MedicalRecord(patientName, recordDetails));
    }

    void displayRecords() {
        for (MedicalRecord record : records) {
            System.out.println("Patient: " + record.patientName + ", Record: " + record.recordDetails);
        }
    }
}
