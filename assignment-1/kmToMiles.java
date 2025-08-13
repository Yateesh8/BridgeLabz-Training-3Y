import java.util.Scanner;
class kmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();

        System.out.println("Miles = " + km * 0.621371);
        sc.close();
    }
}
