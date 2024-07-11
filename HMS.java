public class HMS {
    public static void main(String[] args) {
        // Patient Management
        PatientLinkedList patientList = new PatientLinkedList();
        patientList.addPatient("John Doe", 30, "Flu");
        patientList.addPatient("Jane Smith", 25, "Cold");
        System.out.println("Patients:");
        patientList.displayPatients();

        // Doctor Management
        DoctorArray doctorArray = new DoctorArray(5);
        doctorArray.addDoctor("Dr. Adams", "Cardiology");
        doctorArray.addDoctor("Dr. Brown", "Neurology");
        System.out.println("\nDoctors:");
        doctorArray.displayDoctors();

        // Appointment Scheduling
        AppointmentQueue appointmentQueue = new AppointmentQueue();
        appointmentQueue.scheduleAppointment("John Doe", "Dr. Adams", "10:00 AM");
        appointmentQueue.scheduleAppointment("Jane Smith", "Dr. Brown", "11:00 AM");
        System.out.println("\nAppointments:");
        appointmentQueue.displayAppointments();

        // Medical Records
        MedicalRecordStack recordStack = new MedicalRecordStack();
        recordStack.addRecord("John Doe", "Checked for flu symptoms");
        recordStack.addRecord("Jane Smith", "Prescribed cold medication");
        System.out.println("\nMedical Records:");
        recordStack.displayRecords();

          // Department Hierarchy
          Department root = new Department("Hospital");
          Department cardiology = new Department("Cardiology");
          Department neurology = new Department("Neurology");
          root.addSubDepartment(cardiology);
          root.addSubDepartment(neurology);
          Department pediatricCardiology = new Department("Pediatric Cardiology");
          cardiology.addSubDepartment(pediatricCardiology);
          System.out.println("\nDepartment Hierarchy:");
          root.displayDepartmentHierarchy("");
    }
}
