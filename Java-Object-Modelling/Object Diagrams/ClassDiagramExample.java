package javaObjectDiagram;

import java.util.*;

class Student {
    private String studentId;
    private String name;
    private String grade;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void enrollInCourse(Course course) {
        course.enrollStudent(this);
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class Professor {
    private String empId;
    private String name;

    public Professor(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void assignCourse(Course course) {
        course.assignProfessor(this);
    }
}

class Course {
    private String courseCode;
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String code, String name) {
        this.courseCode = code;
        this.courseName = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor p) {
        this.professor = p;
    }

    public void enrollStudent(Student s) {
        students.add(s);
    }
}

public class ClassDiagramExample {
    public static void main(String[] args) {
        System.out.println("This file represents the CLASS DIAGRAM structure (static design).");
    }
}
