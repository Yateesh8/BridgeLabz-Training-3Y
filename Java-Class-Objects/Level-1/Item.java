package javaClassAndObjectsLevel1;

// Program to Track Inventory of Items
public class Item {
    // Fields (Attributes)
    String itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println("itemCode : " + this.itemCode);
        System.out.println("itemPrice : " + this.price);
        System.out.println("itemName : " + this.itemName);
        System.out.println("----------------------------");
    }

    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return this.price * quantity;
    }

    public static void main(String[] args) {
        // Create Item objects
        Item item1 = new Item("01AA", "Water bottle", 500.0);
        Item item2 = new Item("01BB", "Rice", 700.0);
        Item item3 = new Item("02AA", "Blackboard", 400.0);

        // Display details for each item
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Example of calculating total cost for a quantity of items
        System.out.println("Total cost for 5 water bottles: " + item1.calculateTotalCost(5));
    }
}