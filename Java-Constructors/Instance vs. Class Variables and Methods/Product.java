package javaConstructors;

public class Product {
    String productName;
    double price;
    static int totalProducts = 0; // class variable

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment whenever a new product is created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
