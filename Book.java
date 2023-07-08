public class Book extends LibraryItem {
    private String author;
    private int numPages;

    public Book(String title, String itemID, String author, int numPages) {
        super(title, itemID);
        this.author = author;
        this.numPages = numPages;
    }

    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numPages);
    }
    
    // Getter and Setter methods for additional properties
}