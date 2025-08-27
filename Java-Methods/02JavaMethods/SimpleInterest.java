package javaLevel1;

import java.util.Scanner;

public class SimpleInterest {
    public static double calculateSI(double principal, double rate, double time){
        return principal * rate * time / 100;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal, Rate, Time:");
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        double si=calculateSI(p,r,t);
        System.out.println("The Simple Interest is "+si+" for Principal "+p+", Rate of Interest "+r+" and Time "+t);
        sc.close();
    }
}
