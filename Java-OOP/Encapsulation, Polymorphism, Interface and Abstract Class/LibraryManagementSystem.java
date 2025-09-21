package javaOOPProblems;

import java.util.ArrayList;
import java.util.List;

// Interface for reservable items
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class for library items
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Book class
class Book extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 21; // 3 weeks for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        if(!isReserved) {
            isReserved = true;
            borrower = borrowerName;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Magazine class
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week for magazines
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks for DVDs
    }

    @Override
    public void reserveItem(String borrowerName) {
        if(!isReserved) {
            isReserved = true;
            borrower = borrowerName;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Main Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(new Book("B101", "The Alchemist", "Paulo Coelho"));
        libraryItems.add(new Magazine("M201", "National Geographic", "Various"));
        libraryItems.add(new DVD("D301", "Inception", "Christopher Nolan"));

        // Display details and loan duration
        for(LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Polymorphism: check if item is reservable
            if(item instanceof Reservable reservable) {
                if(reservable.checkAvailability()) {
                    reservable.reserveItem("Tezric");
                } else {
                    System.out.println(item.getTitle() + " is not available for reservation");
                }
            }
            System.out.println("-------------------");
        }
    }
}
