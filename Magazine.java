public class Magazine extends LibraryItem {
    private String issueDate;
    private String publisher;

    public Magazine(String title, String itemID, String issueDate, String publisher) {
        super(title, itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }

    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Issue date: " + issueDate);
        System.out.println("Publisher: " + publisher);
    }
    
    // Getter and Setter methods for additional properties
}