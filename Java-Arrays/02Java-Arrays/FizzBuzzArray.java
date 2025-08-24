package javaArraysLevel1;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Enter a positive integer");
            sc.close();
            return;
        }

        String[] results = new String[number + 1];
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
