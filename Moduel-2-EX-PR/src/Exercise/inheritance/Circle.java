package Exercise.inheritance;

public class Circle {
    private double radius;
    private String color;

    Circle () {

    }

    Circle (double radius, String color ) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius* radius;
    }

    public double getPrimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Radius: %s, Color: %s, Area: %.2f, Primeter: %.2f", this.radius, this.color, this.getArea(), this.getPrimeter());
    }

    public static void main(String[] args) {
        Circle c = new Circle(10, "red");
        System.out.println(c.toString());
    }
}
