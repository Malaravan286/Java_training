class LibraryItem {
    private String title;
    private String author;

    LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void displayDetails() {
        System.out.println(title + " by " + author);
    }
}

class Book extends LibraryItem {
    private int pages;

    Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    public void displayDetails() {
        System.out.println("Book: " + getTitle() + ", Author: " + getAuthor() + ", Pages: " + pages);
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    public void displayDetails() {
        System.out.println("Magazine: " + getTitle() + ", Editor: " + getAuthor() + ", Issue: " + issueNumber);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("Java Basics", "Ravi", 250),
            new Magazine("Tech Monthly", "Meena", 42)
        };

        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }
}
