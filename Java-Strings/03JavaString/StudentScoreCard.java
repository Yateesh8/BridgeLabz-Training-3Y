package javaStringLevel2;

import java.util.Scanner;

public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks for student " + (i+1) + ": ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter Chemistry marks for student " + (i+1) + ": ");
            marks[i][1] = sc.nextInt();
            System.out.print("Enter Maths marks for student " + (i+1) + ": ");
            marks[i][2] = sc.nextInt();
        }

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = total / 3.0; // Since each subject is out of 100

            percentage = Math.round(percentage * 100.0) / 100.0; // round to 2 decimals
            average = Math.round(average * 100.0) / 100.0;

            String grade;
            if (percentage >= 90) grade = "A+";
            else if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B+";
            else if (percentage >= 60) grade = "B";
            else if (percentage >= 50) grade = "C";
            else grade = "F";

            System.out.println((i+1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2]
                    + "\t" + total + "\t" + average + "\t" + percentage + "\t\t" + grade);
        }
    }
}
