/*

    String
    int

*/ 

public class Patient {
String name;
int age;
String disease;
Patient next;

    Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.next = null;
    }
}