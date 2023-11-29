package CodeGym.oop.manager_officers;

public class Employee extends Officer{
    private String job;

    public Employee() {

    }
    public Employee(String job) {
        this.job = job;
    }
    public Employee(String fullName, int age, String gender, String addRess, String job) {
        super(fullName, age, gender, addRess);
        this.job = job;
    }

    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%20s", "Công việc: " + this.job);
    }
}
