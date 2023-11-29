package CodeGym.oop.manager_book;

public class Book extends Document{
    private String author;
    private int page;

    public Book() {}
    public Book(String author, int page) {
        this.author = author;
        this.page = page;
    }
    public Book(String publishingCompany, int releaseNumber, String author, int page) {
        super(publishingCompany, releaseNumber);
        this.author = author;
        this.page = page;
    }

}
