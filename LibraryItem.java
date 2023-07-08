public abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean checkedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
    }

    public void checkOut() {
        checkedOut = true;
        System.out.println(title + " has been checked out.");
    }

    public void checkIn() {
        checkedOut = false;
        System.out.println(title + " has been checked in.");
    }

    public void displayItemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemID);
        System.out.println("Checked Out: " + checkedOut);
    }

    public String getTitle() {
        return title;
    }
}






