package javaObjectDiagram;

class ObjStudent {
    String studentId;
    String name;
    String grade;

    ObjStudent(String id, String name) {
        this.studentId = id;
        this.name = name;
    }
}

class ObjProfessor {
    String empId;
    String name;

    ObjProfessor(String id, String name) {
        this.empId = id;
        this.name = name;
    }
}

class ObjCourse {
    String code;
    String title;
    ObjProfessor professor;
    ObjStudent[] students;

    ObjCourse(String code, String title, int size) {
        this.code = code;
        this.title = title;
        this.students = new ObjStudent[size];
    }
}

public class ObjectDiagramExample {
    public static void main(String[] args) {
        // Objects (snapshot at runtime)
        ObjStudent s1 = new ObjStudent("S01", "John");
        ObjStudent s2 = new ObjStudent("S02", "Emma");
        ObjProfessor p1 = new ObjProfessor("P01", "Dr. Smith");
        ObjCourse c1 = new ObjCourse("CSE101", "Object Oriented Design", 2);

        c1.professor = p1;
        c1.students[0] = s1;
        c1.students[1] = s2;
        s1.grade = "A";
        s2.grade = "B";

        // Print snapshot (state of objects)
        System.out.println("=== OBJECT DIAGRAM SNAPSHOT ===");
        System.out.println("student1 : ObjStudent [id=" + s1.studentId + ", name=" + s1.name + ", grade=" + s1.grade + "]");
        System.out.println("student2 : ObjStudent [id=" + s2.studentId + ", name=" + s2.name + ", grade=" + s2.grade + "]");
        System.out.println("professor : ObjProfessor [id=" + p1.empId + ", name=" + p1.name + "]");
        System.out.println("course : ObjCourse [code=" + c1.code + ", title=" + c1.title + "]");
    }
}
