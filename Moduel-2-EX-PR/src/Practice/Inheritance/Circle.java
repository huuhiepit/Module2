package Practice.Inheritance;

import Exercise.abstracts.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filler) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return String.format("A Circle with radius = %.2f, which is a subclass of %s", radius, super.toString());
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area: " + this.getArea());
        System.out.printf("New Area: %.2f",this.getArea() + (this.getArea() * percent / 100));
        System.out.println();

    }
}
