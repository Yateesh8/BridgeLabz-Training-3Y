package javaMethodsLevel1;

import java.util.Scanner;

public class TriangularRun {
    public static int calculateRounds(double a, double b, double c){
        double perimeter = a + b + c;
        return (int)Math.ceil(5000 / perimeter);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of triangle in meters:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Rounds needed: " + calculateRounds(a, b, c));
        sc.close();
    }
}
