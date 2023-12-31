package Practice.Inheritance;


import Exercise.abstracts.Resizeable;

public abstract class Shape implements Resizeable {
    private String color;
    private boolean filled;
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("A Shape with color of %s and filler: %s", this.color, this.filled);
    }

    @Override
    public void resize(double percent) {

    }

}
