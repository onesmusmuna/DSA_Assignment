import java.util.LinkedList;
import java.util.Queue;

public class AppointmentQueue {
        private Queue<Appointment> appointments;

    AppointmentQueue() {
        appointments = new LinkedList<>();
    }

    void scheduleAppointment(String patientName, String doctorName, String time) {
        appointments.add(new Appointment(patientName, doctorName, time));
    }

    void displayAppointments() {
        for (Appointment appointment : appointments) {
            System.out.println("Patient: " + appointment.patientName + ", Doctor: " + appointment.doctorName + ", Time: " + appointment.time);
        }
    }
}
