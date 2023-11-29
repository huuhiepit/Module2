package Exercise.inheritance;

public class Point {
    private float x;
    private float y;

    Point() {}
    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return String.format("(%.1f, %.1f)", this.x, this.y);
    }
}
