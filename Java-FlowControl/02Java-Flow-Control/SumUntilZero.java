package javaFlowControl2;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        System.out.print("Enter a number (0 to stop): ");
        double num = sc.nextDouble();

        while (num != 0) {
            total += num;
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextDouble();
        }

        System.out.println("Total sum = " + total);
    }
}
