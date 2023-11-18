package Practice.AccessModifier;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
    this.rollno = r;
    this.name = n;
    }

    static void change() {
        college = "Code Gym";
    }
    void display() {
        System.out.printf("%s  %s  %s", this.rollno, this.name, college);
    }

    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Hiep");
        Student s2 = new Student(112, "Huu");
        Student s3 = new Student(113, "Nguyen");
        s1.display();
        s2.display();
        s3.display();

    }
}