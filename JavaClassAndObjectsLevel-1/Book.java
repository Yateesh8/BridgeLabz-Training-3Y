package javaClassAndObjectsLevel1;

public class Book {
    // Fields (Attributes)
    String bookTitle;
    String bookAuthor;
    double price;

    // Constructor
    Book(String bookTitle, String bookAuthor, double price){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title of the book: " + bookTitle);
        System.out.println("Author of the book: " + bookAuthor);
        System.out.println("Price of the book: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("2States", "Chetan Bhagat", 500);
        Book book2 = new Book("Wings Of Fire", "Abdul kalam.A.P.J", 500);

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}