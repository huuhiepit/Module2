package CodeGym.oop.lesson13;

import java.time.LocalDate;

public abstract class Employee {
    private int id;
    private String fullName;
    private LocalDate birthDay;
    private String phone;
    private String email;
    private String employee_Type;
    private Certificate[] certificates;
    public static int employee_Count = 0;
    public static int nextId = 1;
    //Constructor
    public Employee() {
        this.id = nextId;
        nextId++;
        employee_Count++;
    }
    public Employee(String fullName, LocalDate birthDay, String phone, String email, String employee_Type) {
        this.id = nextId;
        nextId++;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employee_Type = employee_Type;
        employee_Count++;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployee_Type() {
        return employee_Type;
    }

    public void setEmployee_Type(String employee_Type) {
        this.employee_Type = employee_Type;
    }

    //Abstract Method
    public abstract String showInfo();

    @Override
    public String toString() {
        return String.format("%10s %25s %20s %20s %20s", this.id, this.fullName, this.birthDay, this.email, this.employee_Type);
    }

}
