package javaMethodsLevel1;

import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] distribute(int chocolates, int children){
        return new int[]{chocolates / children, chocolates % children};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of chocolates and children:");
        int c = sc.nextInt();
        int n = sc.nextInt();
        int[] res = distribute(c, n);
        System.out.println("Each child gets: " + res[0] + ", Remaining: " + res[1]);
        sc.close();
    }
}
