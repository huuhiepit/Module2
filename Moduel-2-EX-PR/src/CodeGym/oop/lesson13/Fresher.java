package CodeGym.oop.lesson13;

import java.time.LocalDate;

public class Fresher extends Employee{
    private LocalDate graduationDate;
    private String graduationRank; //Giỏi, Khá, Trung bình.
    private String education;

    public Fresher() {
    }
    public Fresher(LocalDate graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }
    public Fresher(String fullName, LocalDate birthDay, String phone, String email, String employee_Type, LocalDate graduationDate, String graduationRank, String education) {
        super(fullName, birthDay, phone, email, employee_Type);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String showInfo() {
        return super.toString() + String.format("%15s %15s %15s", this.graduationDate, this.graduationRank, this.education);
    }
}
