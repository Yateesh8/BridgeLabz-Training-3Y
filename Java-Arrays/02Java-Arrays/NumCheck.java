package javaArraysLevel1;

import java.util.Scanner;

public class NumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter the 5 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nNumber Check Results:");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num == 0) {
                System.out.println(num + " is Zero");
            } else if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else { // num < 0
                System.out.println(num+" is negative number");
            }
        }
    }
}
