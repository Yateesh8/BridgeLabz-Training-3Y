package javaArraysLevel1;

import java.util.Scanner;

public class VotingOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter the age of 10 students : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < arr.length; i++) {
            int age = arr[i];

            if (age < 0) {
                System.out.println("Invalid age entered for student " + (i + 1));
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        sc.close();
    }
}
