package javaOOPProblems;

import java.util.ArrayList;
import java.util.List;

// Interface for discountable food items
interface Discountable {
    void applyDiscount(double percentage);
    double getDiscountedPrice();
}

// Abstract FoodItem class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discountedPrice;

    public VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount(double percentage) {
        discountedPrice = calculateTotalPrice() * (1 - percentage / 100);
    }

    @Override
    public double getDiscountedPrice() { return discountedPrice; }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double discountedPrice;

    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + 20) * getQuantity(); // extra charge for non-veg
    }

    @Override
    public void applyDiscount(double percentage) {
        discountedPrice = calculateTotalPrice() * (1 - percentage / 100);
    }

    @Override
    public double getDiscountedPrice() { return discountedPrice; }
}

// Main Online Food Delivery System
public class FoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 150, 2));
        order.add(new NonVegItem("Chicken Burger", 200, 1));

        for(FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);

            if(item instanceof Discountable d) {
                d.applyDiscount(10); // 10% discount
                System.out.println("Price after Discount: " + d.getDiscountedPrice());
            }

            System.out.println("-------------------");
        }
    }
}
