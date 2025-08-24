package javaArraysLevel2;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), temp = num, count = 0;
        while (temp != 0) { count++; temp /= 10; }
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) { digits[i] = num % 10; num /= 10; }
        for (int i = 0; i < count; i++) System.out.print(digits[i]);
        sc.close();
    }
}
