package javaConstructors;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000; // example cost per day

    // Default Constructor
    public CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double totalCost() {
        return rentalDays * costPerDay;
    }

    public void showDetails() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + totalCost());
    }
}
