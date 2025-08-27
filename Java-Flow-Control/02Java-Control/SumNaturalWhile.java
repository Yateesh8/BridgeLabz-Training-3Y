package javaFlowControl2;
import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            // Formula method
            int formulaSum = n * (n + 1) / 2;

            // While loop method
            int i = 1, loopSum = 0;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            System.out.println("Both results are equal? " + (formulaSum == loopSum));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
