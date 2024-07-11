/*

    Array

*/ 

public class DoctorArray {
    private Doctor[] doctors;
    private int count;

    DoctorArray(int size) {
        doctors = new Doctor[size];
        count = 0;
    }

    void addDoctor(String name, String specialty) {
        if (count < doctors.length) {
            doctors[count++] = new Doctor(name, specialty);
        } else {
            System.out.println("Doctor array is full!");
        }
    }

    void displayDoctors() {
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + doctors[i].name + ", Specialty: " + doctors[i].specialty);
        }
    }
}
