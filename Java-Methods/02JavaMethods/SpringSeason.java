package javaMethodsLevel1;

import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpring(int month, int day){
        if(month < 3 || month > 6) return false;
        if(month == 3 && day < 20) return false;
        if(month == 6 && day > 20) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month and day:");
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(isSpring(m, d) ? "Its a Spring Season" : "Not a Spring Season");
        sc.close();
    }
}
