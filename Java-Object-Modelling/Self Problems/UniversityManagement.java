package javaObjectModelling;

import java.util.*;

class Course {
    private String name;
    private Professor professor;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor p) {
        this.professor = p;
    }

    public void enrollStudent(Students s) {
        students.add(s);
    }

    public void showDetails() {
        System.out.println("Course: " + name);
        if (professor != null) {
            System.out.println(" Professor: " + professor.getName());
        }
        for (Student s : students) {
            System.out.println(" - Student: " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        // Create professor
        Professor prof1 = new Professor("Dr. Sharma");

        // Create courses
        Course java = new Course("Java Programming");
        Course dbms = new Course("Database Systems");

        // Assign professor to course
        java.assignProfessor(prof1);

        // Create students
        Student s1 = new Student("Amit");
        Student s2 = new Student("Neha");

        // Enroll students in courses
        s1.enrollCourse(java);
        s2.enrollCourse(java);
        s1.enrollCourse(dbms);

        // Show details
        java.showDetails();
        dbms.showDetails();
    }
}
