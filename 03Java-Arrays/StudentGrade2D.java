package javaArraysLevel2;
import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int m = sc.nextInt();
                if (m < 0) {
                    j--;
                    continue;
                }
                marks[i][j] = m;
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = total / 3.0;
            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " " + percent[i] + " " + grade[i]);
        }
    }
}
