import java.util.Scanner;
public class cylinderVol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        System.out.println("Volume: " + (Math.PI * r * r * h));
        sc.close();
    }
}
