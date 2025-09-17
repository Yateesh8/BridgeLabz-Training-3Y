package javaObjectModelling;
import java.util.*;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("   Employee: " + name);
    }
}

class Department1 {
    private String name;
    private List<Employee> employees;

    public Department1(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void show() {
        System.out.println(" Department: " + name);
        for (Employee e : employees) {
            e.show();
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void show() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.show();
        }
    }
}
