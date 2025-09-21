package javaOOPProblems;

import java.util.ArrayList;
import java.util.List;

// Interface for medical record handling
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract Patient class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Abstract method for billing
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double dailyRate;
    private int days;

    public InPatient(int id, String name, int age, double dailyRate, int days) {
        super(id, name, age);
        this.dailyRate = dailyRate;
        this.days = days;
    }

    @Override
    public double calculateBill() {
        return dailyRate * days;
    }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { System.out.println("Medical Records: " + records); }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { System.out.println("Medical Records: " + records); }
}

// Main Hospital Management
public class HospitalSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(101, "Alice", 30, 2000, 5));
        patients.add(new OutPatient(102, "Bob", 25, 500));

        for(Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());

            if(p instanceof MedicalRecord mr) {
                mr.addRecord("Initial Checkup");
                mr.viewRecords();
            }

            System.out.println("-------------------");
        }
    }
}
