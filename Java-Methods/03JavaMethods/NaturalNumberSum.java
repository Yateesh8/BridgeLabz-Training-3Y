package javaMethodsLevel2;

import java.util.Scanner;

public class NaturalNumberSum {

    public static int recursiveSum(int n) {
        if (n <= 1) return n;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }
        int sumRec = recursiveSum(n);
        int sumFormula = formulaSum(n);
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumFormula);
    }
}
