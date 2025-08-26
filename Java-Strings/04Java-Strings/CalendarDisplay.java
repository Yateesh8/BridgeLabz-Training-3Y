package javaStringLevel3;

import java.util.Scanner;

public class CalendarDisplay {
    public static boolean leap(int y){ return (y%4==0 && y%100!=0)||(y%400==0);}
    public static int daysInMonth(int m,int y){
        int[] d={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && leap(y)) return 29;
        return d[m-1];
    }
    public static String monthName(int m){
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[m-1];
    }
    public static int firstDay(int d,int m,int y){
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        return (d+x+31*m0/12)%7;
    }
    public static void displayCalendar(int m,int y){
        System.out.println("   "+monthName(m)+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int f=firstDay(1,m,y);
        for(int i=0;i<f;i++) System.out.print("    ");
        int days=daysInMonth(m,y);
        for(int i=1;i<=days;i++){
            System.out.printf("%3d ",i);
            if((i+f)%7==0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month and year:");
        int m=sc.nextInt();
        int y=sc.nextInt();
        displayCalendar(m,y);
        sc.close();
    }
}
