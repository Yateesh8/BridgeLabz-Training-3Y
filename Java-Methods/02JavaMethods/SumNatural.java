package javaMethodsLevel1;

import java.util.Scanner;

public class SumNatural {
    public static int sumN(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers: " + sumN(n));
        sc.close();
    }
}
