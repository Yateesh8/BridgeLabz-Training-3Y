package javaObjectModelling;

import java.util.*;

class Courses {
    private String name;
    private List<Students> students;

    public Courses(String name) {
        this.name = name;
        this.students = new ArrayList<Students>();
    }

    public void enrollStudent(Students s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Course: " + name);
        for (Students s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

class Students {
    private String name;
    private List<Course> courses;

    public Students(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    public void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(" - " + c.toString());
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}
