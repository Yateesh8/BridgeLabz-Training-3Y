package assignmentLevel1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("The addition, subtraction, multiplication and division value of two numbers "
                + a +" and "+ b +" is: "+ (a+b)+", "+(a-b)+", "+ (a*b)+", and "+ (double)(a/b)+".");
    }
}
