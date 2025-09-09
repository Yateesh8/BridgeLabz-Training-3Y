package javaConstructors;

// Parent class
class BookLibrarySystem {
    public String ISBN;       // public
    protected String title;   // protected
    private String author;    // private

    // Constructor
    public BookLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

// Child class
class EBook extends BookLibrarySystem {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void showEBookDetails() {
        // Can access public and protected directly
        System.out.println("EBook - ISBN: " + ISBN + ", Title: " + title);

        // Author is private → must use getter
        System.out.println("Author (via getter): " + getAuthor());
    }
}

