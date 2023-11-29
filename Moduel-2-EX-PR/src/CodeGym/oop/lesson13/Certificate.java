package CodeGym.oop.lesson13;

import java.time.LocalDateTime;

public class Certificate {
    private int id;
    private String certificateName;
    private String certificateRank; //Gioi, Kha, Trung binh.
    private LocalDateTime certificateDate;
    private static int nextId = 1;

    public Certificate(){
        this.id = nextId;
        nextId++;
    }
    public Certificate(String certificateName, String certificateRank, LocalDateTime certificateDate) {
        this.id = nextId;
        nextId++;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

}
