package javaConstructors;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void showPostgraduateInfo() {
        // Can access public and protected members directly
        System.out.println("Postgraduate Student - Roll No: " + rollNumber + ", Name: " + name);
        // Cannot access CGPA directly (it's private in parent)
    }
}
