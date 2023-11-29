package CodeGym.oop.lesson13;

import java.time.LocalDate;

public class Experience extends Employee{
    private int expInYear;
    private String proSkill; //Giỏi, Khá, Trung bình, Yếu

    public Experience() {
    }
    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    public Experience(String fullName, LocalDate birthDay, String phone, String email, String employee_Type, int expInYear, String proSkill) {
        super(fullName, birthDay, phone, email, employee_Type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }


    @Override
    public String showInfo() {
        return super.toString() + String.format("%15s %15s", this.expInYear, this.proSkill);
    }

}
