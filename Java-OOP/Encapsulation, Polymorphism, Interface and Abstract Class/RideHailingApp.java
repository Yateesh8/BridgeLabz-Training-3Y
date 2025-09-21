package javaOOPProblems;

import java.util.ArrayList;
import java.util.List;

// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract Vehicle class
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    // Abstract method for fare calculation
    public abstract double calculateFare(double distance);

    // Concrete method to display vehicle info
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}

// Car class
class Car extends Vehicle implements GPS {
    private String location;

    public Car(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { location = newLocation; }
}

// Bike class
class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { location = newLocation; }
}

// Auto class
class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.9; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { location = newLocation; }
}

// Main Ride-Hailing App
public class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("C101", "Alice", 15));
        rides.add(new Bike("B102", "Bob", 10));
        rides.add(new Auto("A103", "Charlie", 12));

        double distance = 10; // 10 km ride

        for(Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));

            if(v instanceof GPS gps) {
                gps.updateLocation("Downtown");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            System.out.println("-------------------");
        }
    }
}
