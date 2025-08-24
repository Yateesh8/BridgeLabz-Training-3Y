package javaArraysLevel1;

import java.util.Scanner;

public class TableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int[] arr = new int[10];

        for (int i = 6; i < 10; i++) {
            arr[i] = num * (i+1);
        }
        // display the table
        System.out.println("Multiplication table of " + num + " from 6 to 9 is: ");
        for(int i=6; i<10; i++){
            System.out.println(num+ " * "+ (i)+ " = " + arr[i]);
        }
    }
}

