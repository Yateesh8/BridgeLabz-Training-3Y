package javaOOPProblems;

import java.util.ArrayList;
import java.util.List;

// Interface for taxable products
interface Taxable {
    double calculateTax(); // Calculate tax
    String getTaxDetails(); // Tax description
}

// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: Getters and Setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Concrete method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.10; } // 10% discount

    @Override
    public double calculateTax() { return getPrice() * 0.18; } // 18% GST

    @Override
    public String getTaxDetails() { return "GST 18%"; }
}

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.15; } // 15% discount

    @Override
    public double calculateTax() { return getPrice() * 0.05; } // 5% GST

    @Override
    public String getTaxDetails() { return "GST 5%"; }
}

// Groceries class
class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.05; } // 5% discount
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "T-Shirt", 1000));
        products.add(new Groceries(3, "Rice", 500));

        // Process products (Polymorphism)
        for (Product p : products) {
            p.displayDetails();
            double finalPrice = p.getPrice() - p.calculateDiscount();
            if (p instanceof Taxable taxable) {
                finalPrice += taxable.calculateTax();
                System.out.println(taxable.getTaxDetails());
            }
            System.out.println("Final Price: " + finalPrice);
            System.out.println("---------------------");
        }
    }
}
