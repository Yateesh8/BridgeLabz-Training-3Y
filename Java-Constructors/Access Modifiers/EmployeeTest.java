package javaConstructors;

// Base Class
class Employee {
    public int employeeID;        // public
    protected String department;  // protected
    private double salary;        // private

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("Salary updated to: " + salary);
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

// Subclass
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void showManagerInfo() {
        // Can access public and protected members
        System.out.println("Manager - ID: " + employeeID + ", Department: " + department);
        // Salary is private → cannot be accessed directly
    }
}

// Main Class
public class EmployeeTest {
    public static void main(String[] args) {
        Manager m1 = new Manager(101, "Finance", 55000);

        m1.displayEmployee();   // From parent class
        m1.showManagerInfo();   // From child class
        m1.updateSalary(65000); // Modify salary using public method
        m1.displayEmployee();
    }
}
