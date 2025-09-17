package javaObjectModelling;

import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getDetails() {
        return name + " - $" + price;
    }
}

class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showProducts() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println(" - " + p.getDetails());
        }
    }
}

class Customers {
    private String name;
    private List<Order> orders;

    public Customers(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
    }

    public void showOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.showProducts();
        }
    }
}
