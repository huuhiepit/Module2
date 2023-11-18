package Practice.Inheritance;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return super.getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return String.format("A Square with side = %.2f, which is a subclass of %s", this.getSide(), super.toString());
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.7, "yellow", true);
        System.out.println(square);
    }
}

