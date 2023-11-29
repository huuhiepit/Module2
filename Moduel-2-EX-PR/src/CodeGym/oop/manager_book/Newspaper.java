package CodeGym.oop.manager_book;

import java.time.LocalDate;

public class Newspaper extends Document{
    private LocalDate releaseDate;
    public Newspaper() {}
    public Newspaper(LocalDate time) {
        this.releaseDate = time;
    }
    public Newspaper(String publishingCompany, int releaseNumber, LocalDate date) {
        super(publishingCompany, releaseNumber);
        this.releaseDate = date;
    }
}
