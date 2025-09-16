package javaInheritance;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student of grade " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is Staff in " + department + " department");
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Math");
        Student s = new Student("Ravi", 16, "10th");
        Staff st = new Staff("Anita", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
