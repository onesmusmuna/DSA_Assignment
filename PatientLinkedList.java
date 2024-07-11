/*

    Linked List

*/ 


public class PatientLinkedList {
    private Patient head;

    void addPatient(String name, int age, String disease) {
        Patient newPatient = new Patient(name, age, disease);
        if (head == null) {
            head = newPatient;
        } else {
            Patient current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPatient;
        }
    }

    void displayPatients() {
        Patient current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Age: " + current.age + ", Disease: " + current.disease);
            current = current.next;
        }
    }
}
