import java.util.Scanner;

public class multiplication {
    public static int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int c = multiply(a,b);
        System.out.println(c);
    }
}

