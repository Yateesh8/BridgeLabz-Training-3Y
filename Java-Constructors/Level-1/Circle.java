package javaConstructors;

public class Circle {
    double radius;

    // Default Constructor (calls parameterized one)
    public Circle() {
        this(1.0);
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
