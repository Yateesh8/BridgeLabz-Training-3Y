package assignmentLevel1;

import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle in inches: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle in inches: ");
        double height = sc.nextDouble();

        double areaInInches = 0.5 * base * height;

        double areaInCm = areaInInches * 2.54 * 2.54;

        System.out.println("The area of the triangle is " + areaInInches + " square inches");
        System.out.println("The area of the triangle is " + areaInCm + " square centimeters");

        sc.close();
    }
}
