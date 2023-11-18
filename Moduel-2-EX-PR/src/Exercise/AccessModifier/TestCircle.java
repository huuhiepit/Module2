package Exercise.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Radius: " + c.getRadius());
        System.out.printf("Area: %.2f", c.getArea());
    }
}
