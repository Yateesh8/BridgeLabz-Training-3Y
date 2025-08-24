package javaArraysLevel2;
import java.util.Scanner;

public class TeamBMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            if (w <= 0 || h <= 0) { i--; continue; }
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);
            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25) weightStatus[i] = "Normal";
            else if (personData[i][2] < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1]+" "+personData[i][0]+" "+personData[i][2]+" "+weightStatus[i]);
        }
        sc.close();
    }
}
