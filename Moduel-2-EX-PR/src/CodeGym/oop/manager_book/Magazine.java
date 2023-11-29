package CodeGym.oop.manager_book;

public class Magazine extends Document{
    private int issueNumber;
    private int releaseMonth;

    public Magazine() {}
    public Magazine(int issueNumber, int releaseMonth) {
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }
    public Magazine(String publishingCompany, int releaseNumber, int issueNumber, int releaseMonth) {
        super(publishingCompany, releaseNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }
}
