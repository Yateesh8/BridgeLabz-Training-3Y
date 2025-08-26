package javaMethodsLevel1;

import java.util.Scanner;

public class NumberCheck {
    public static int checkNumber(int n){
        return n > 0 ? 1 : (n < 0 ? -1 : 0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int res = checkNumber(n);
        System.out.println(res == 1 ? "Positive" : res == -1 ? "Negative" : "Zero");
        sc.close();
    }
}
