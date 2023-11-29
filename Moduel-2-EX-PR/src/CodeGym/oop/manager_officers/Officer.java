package CodeGym.oop.manager_officers;

public class Officer {
    private static int nextId = 1;
    private int id;
    private String fullName;
    private int age;
    private String gender;
    private String addRess;

    public Officer() {
        this.id = nextId;
        nextId++;
    }

    public Officer(String fullName, int age, String gender, String addRess) {
        this.id = nextId;
        nextId++;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.addRess = addRess;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    @Override
    public String toString() {
        return String.format("%20s %10s %10s %10s", this.fullName, this.age, this.gender, this.addRess);
    }

//    public abstract void SearchName(String name);
}
