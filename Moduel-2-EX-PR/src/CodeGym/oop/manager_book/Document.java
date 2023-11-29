package CodeGym.oop.manager_book;

public abstract class Document {
    private int id;
    private String publishingCompany; //Tên nhà sản xuất
    private int releaseNumber; //Số bản phát hành

    public static int nextId = 0;
    public Document() {}

    public Document(String publishingCompany, int releaseNumber) {
        this.id = ++nextId;
        this.publishingCompany = publishingCompany;
        this.releaseNumber = releaseNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }
}
