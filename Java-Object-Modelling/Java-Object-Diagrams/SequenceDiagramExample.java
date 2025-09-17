package javaObjectDiagram;

class SeqStudent {
    String id;
    String name;

    SeqStudent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    void enrollInCourse(SeqCourse course) {
        System.out.println("Student -> Course : enrollInCourse()");
        course.enrollStudent(this);
    }
}

class SeqProfessor {
    String id;
    String name;

    SeqProfessor(String id, String name) {
        this.id = id;
        this.name = name;
    }

    void assignCourse(SeqCourse course) {
        System.out.println("Professor -> Course : assignCourse()");
        course.professor = this;
    }
}

class SeqCourse {
    String code;
    String title;
    SeqProfessor professor;

    SeqCourse(String code, String title) {
        this.code = code;
        this.title = title;
    }

    void enrollStudent(SeqStudent s) {
        System.out.println("Course -> Course : enrollStudent(" + s.name + ")");
    }
}

public class SequenceDiagramExample {
    public static void main(String[] args) {
        SeqStudent s1 = new SeqStudent("S03", "Alice");
        SeqProfessor p1 = new SeqProfessor("P02", "Dr. Brown");
        SeqCourse c1 = new SeqCourse("CSE201", "Software Engineering");

        System.out.println("=== SEQUENCE DIAGRAM (Student enrolls in Course) ===");
        s1.enrollInCourse(c1);
        p1.assignCourse(c1);
        System.out.println("Course -> Console : showCourseDetails()");
    }
}
