package CodeGym.oop.manager_officers;

public class Engineer extends Officer{
    private String specialized;

    public Engineer() {

    }
    public Engineer(String specialized) {
        this.specialized = specialized;
    }
    public Engineer(String fullName, int age, String gender, String addRess, String specialized) {
        super(fullName, age, gender, addRess);
        this.specialized = specialized;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%20s","Ngành đào tạo: " + this.specialized);
    }
}
