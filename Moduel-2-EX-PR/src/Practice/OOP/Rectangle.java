package Practice.OOP;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return this.getArea() * 2;
    }
    public String display() {
        return String.format("Rectangle { width = %f, height = %f }", this.width, this.height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(49, 40);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
