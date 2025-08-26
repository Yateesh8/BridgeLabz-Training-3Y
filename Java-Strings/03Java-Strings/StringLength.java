package javaStringLevel2;
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        System.out.println("Calculated Length = " + count);
        System.out.println("Built-in Length = " + str.length());
        sc.close();
    }
}
