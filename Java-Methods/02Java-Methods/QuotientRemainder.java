package javaMethodsLevel1;

import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        return new int[]{number / divisor, number % divisor};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and divisor:");
        int num = sc.nextInt();
        int div = sc.nextInt();
        int[] res = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + res[0] + ", Remainder: " + res[1]);
        sc.close();
    }
}
