package javaMethodsLevel2;

import java.util.Scanner;

public class NumberUtils {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is positive");
                if (isEven(num)) System.out.println(" and even");
                else System.out.println(" and odd");
            } else {
                System.out.println(num + " is negative");
            }
        }
        int cmp = compare(numbers[0], numbers[4]);
        if (cmp == 1) System.out.println("First number is greater than last number");
        else if (cmp == 0) System.out.println("First number is equal to last number");
        else System.out.println("First number is less than last number");
    }
}
