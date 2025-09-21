package javaOOPProblems;

import java.util.ArrayList;
import java.util.List;

// Interface representing insurable vehicles
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class renamed to avoid conflict
abstract class RentalVehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public RentalVehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rate per Day: " + rentalRate);
    }
}

// Car renamed
class RentalCar extends RentalVehicle implements Insurable {
    public RentalCar(String vehicleNumber, double rate) { super(vehicleNumber, "Car", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 5000; }

    @Override
    public String getInsuranceDetails() { return "Car Insurance Policy"; }
}

// Bike renamed
class RentalBike extends RentalVehicle implements Insurable {
    public RentalBike(String vehicleNumber, double rate) { super(vehicleNumber, "Bike", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 1500; }

    @Override
    public String getInsuranceDetails() { return "Bike Insurance Policy"; }
}

// Truck renamed
class RentalTruck extends RentalVehicle implements Insurable {
    public RentalTruck(String vehicleNumber, double rate) { super(vehicleNumber, "Truck", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 10000; }

    @Override
    public String getInsuranceDetails() { return "Truck Insurance Policy"; }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<RentalVehicle> vehicles = new ArrayList<>();
        vehicles.add(new RentalCar("C123", 2000));
        vehicles.add(new RentalBike("B456", 500));
        vehicles.add(new RentalTruck("T789", 5000));

        for (RentalVehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for 3 days: " + v.calculateRentalCost(3));
            if (v instanceof Insurable insurable) {
                System.out.println(insurable.getInsuranceDetails() + ": " + insurable.calculateInsurance());
            }
            System.out.println("------------------");
        }
    }
}
