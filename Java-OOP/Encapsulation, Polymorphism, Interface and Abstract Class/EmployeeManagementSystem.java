package javaOOPProblems;

import java.util.ArrayList;
import java.util.List;

// Interface representing Department behavior
interface Department {
    void assignDepartment(String deptName); // Assign employee to a department
    String getDepartmentDetails(); // Get department information
}

// Abstract class representing Employee
abstract class Employee {
    // Encapsulated fields
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter and Setter methods (Encapsulation)
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Abstract method to calculate salary (Polymorphism)
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Full-time Employee class
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed salary
    }
}

// Part-time Employee class
class PartTimeEmployee extends Employee {
    private int hoursWorked; // Hours worked
    private double hourlyRate; // Rate per hour

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0); // Base salary is 0 for part-time
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Implementation of Department interface
class DepartmentImpl implements Department {
    private String deptName;

    @Override
    public void assignDepartment(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + deptName;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // List to hold employees (Polymorphism)
        List<Employee> employees = new ArrayList<>();

        // Adding employees
        employees.add(new FullTimeEmployee(101, "Alice", 50000));
        employees.add(new PartTimeEmployee(102, "Bob", 200, 80));

        // Department assignment
        DepartmentImpl dept = new DepartmentImpl();
        dept.assignDepartment("IT");

        // Display employee details along with department
        for (Employee emp : employees) {
            emp.displayDetails(); // Polymorphic call
            System.out.println(dept.getDepartmentDetails());
            System.out.println("-------------------------");
        }
    }
}
