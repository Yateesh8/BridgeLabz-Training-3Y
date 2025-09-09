package javaClassAndObjectsLevel1;

public class Circle {

    // Field (Attribute)
    double radius;

    // Constructor
    Circle(double radius){
        this.radius = radius;
    }

    // Method to calculate and display the area
    public void areaCircle() {
        System.out.printf("Area of circle: %.4f",(Math.PI * radius * radius));
    }

    // Method to calculate and display the circumference
    public void circumferenceCircle() {
        System.out.printf("\nCircumference of circle: %.4f ",(2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(2.5);

        // Call the methods
        circle.areaCircle();
        circle.circumferenceCircle();
    }
}