package javaArraysLevel1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num * (i+1);
        }
        // display the table
        System.out.println("Multiplication table of " + num + " is: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(num+ " * "+ (i+1)+ " = " + arr[i]);
        }
    }
}
