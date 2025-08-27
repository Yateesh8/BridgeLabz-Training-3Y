package javaStringLevel3;

import java.util.Scanner;

public class BMICalculator {
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;
            double bmi = weight / (height * height);
            String status = bmi < 18.5 ? "Underweight" : bmi < 25 ? "Normal" : bmi < 30 ? "Overweight" : "Obese";
            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayBMI(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight(kg) and height(cm) for person " + (i + 1));
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        displayBMI(calculateBMI(data));
        sc.close();
    }
}
