package assignmentLevel1;

import java.util.Scanner;

public class distanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println(distanceInFeet + " feet is " + yards + " yards and " + miles + " miles");
        sc.close();
    }
}
