package javaObjectModelling;

import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(" Faculty: " + name);
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(" Department: " + name);
    }
}

class University {
    private String name;
    private List<Department> departments; // Composition
    private List<Faculty> faculties;      // Aggregation

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void show() {
        System.out.println("University: " + name);
        for (Department d : departments) {
            d.show();
        }
        for (Faculty f : faculties) {
            f.show();
        }
    }
}
