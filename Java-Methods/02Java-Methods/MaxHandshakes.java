package javaMethodsLevel1;

import java.util.Scanner;

public class MaxHandshakes {
    public static int calculateHandshakes(int n){
        return n * (n - 1) / 2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        System.out.println("Maximum handshakes: " + calculateHandshakes(n));
        sc.close();
    }
}
