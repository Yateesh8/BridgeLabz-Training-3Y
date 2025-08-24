package javaArraysLevel1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10]; // array of max size 10
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

        // infinite loop as per requirement
        while (true) {
            double num = sc.nextDouble();

            if (num <= 0) { // stop on 0 or negative
                break;
            }

            if (index == 10) { // stop when array is full
                System.out.println("Array is full (10 elements max).");
                break;
            }

            arr[index] = num;
            index++;
        }

        // display all entered numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }
        System.out.println("\n\nSum of all numbers = " + total);

        sc.close();
    }
}
