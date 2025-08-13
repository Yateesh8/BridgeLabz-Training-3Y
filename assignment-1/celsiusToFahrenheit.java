import java.util.Scanner;
public class celsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + (c * 1.8 + 32));
        sc.close();
    }
}
