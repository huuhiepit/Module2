package Exercise.OOP;

public class QuadraticEquation {
    //Phuong trinh bac 2: ax2 + bx + c = 0
    private double a, b, c;
    public double delta;
    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = b * b - 4 * a * c;
    }
    public double getDiscriminant() {
        return delta;
    }
    public double getRoot1() {
        return (-this.b + Math.sqrt(this.delta)) / 2 * a;
    }
    public double getRoot2() {
        return (-this.b - Math.sqrt(this.delta)) / 2 * a;
    }
    public void result() {
        if(this.delta > 0) {
            System.out.printf("The equation has two roots %.2f and %.2f", this.getRoot1(), this.getRoot2());
        } else if(this.delta == 0) {
            System.out.println("The equation has one root " + -this.b / 2 * a);
        } else {
            System.out.println("The equation has no real roots");
        }
    }

    public static void main(String[] args) {
        QuadraticEquation q = new QuadraticEquation(1, 3, 1);
        q.result();

    }
}
