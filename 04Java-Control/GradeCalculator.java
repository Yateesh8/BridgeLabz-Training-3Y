package javaFlowControl4;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();
        int total = phy + chem + math;
        double avg = total / 3.0;
        System.out.println("Average Marks: " + avg);
        if (avg >= 90) System.out.println("Grade A - Excellent");
        else if (avg >= 75) System.out.println("Grade B - Very Good");
        else if (avg >= 60) System.out.println("Grade C - Good");
        else if (avg >= 40) System.out.println("Grade D - Pass");
        else System.out.println("Grade F - Fail");
    }
}
