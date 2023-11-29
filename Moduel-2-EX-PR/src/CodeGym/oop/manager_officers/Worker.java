package CodeGym.oop.manager_officers;

public class Worker extends Officer{
    private int level;

    public Worker() {
        level = 1;
    }
    public Worker(String fullName, int age, String gender, String addRess, int level) {
        super(fullName, age, gender, addRess);
        this.level = level;
    }
    public Worker(byte step) {
        this.level = step;
    }

    public int getStep() {
        return level;
    }

    public void setStep(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%20s","Cấp độ: " + this.level);
    }
//    @Override
//    public void SearchName(String name) {
//
//    }
}
