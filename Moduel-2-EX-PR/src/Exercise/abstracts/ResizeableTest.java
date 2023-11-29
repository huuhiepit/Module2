package Exercise.abstracts;

import Practice.Inheritance.Circle;
import Practice.Inheritance.Rectangle;
import Practice.Inheritance.Shape;
import Practice.Inheritance.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 11);
        shapes[2] = new Square(14);

        for(Shape shape: shapes) {
            if(shape instanceof Square) {
                ((Square) shape).howToColor();
            }
            shape.resize(Math.floor(Math.random() * 100 + 1));
        }

    }
}
