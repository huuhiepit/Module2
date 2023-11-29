package Exercise.inheritance;

public class Cylinder extends Circle{
    private double height;

    Cylinder() {

    }
    Cylinder (double height) {
        this.height = height;
    }
    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return Math.PI * super.getRadius() * super.getRadius() * this.height;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" , Height: %.2f, Volume: %.2f", this.height, this.getVolume());
    }

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(10, "blue", 12);
    }
}
