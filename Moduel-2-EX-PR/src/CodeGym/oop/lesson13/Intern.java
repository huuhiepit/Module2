package CodeGym.oop.lesson13;

import java.time.LocalDate;

public class Intern extends Employee{
    private String majors;
    private int semester;
    private String universityName;
    public Intern() {
    }
    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }
    public Intern(String fullName, LocalDate birthDay, String phone, String email, String employee_Type, String majors, int semester, String universityName) {
        super(fullName, birthDay, phone, email, employee_Type);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String showInfo() {
        return super.toString() + String.format("%15s %15s %15s", this.majors, this.semester, this.universityName);
    }
}
