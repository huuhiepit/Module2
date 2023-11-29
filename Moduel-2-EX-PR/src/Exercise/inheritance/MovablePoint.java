package Exercise.inheritance;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint() {}

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" , speed=(%s,%s)", this.xSpeed, this.ySpeed);
    }

    public MovablePoint move() {
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint mv = new MovablePoint(12, 6, 6, 6);
        Point p = new MovablePoint(10, 10, 10, 10);
        Point[] p1 = new Point[5];
        System.out.println(p.toString());
        System.out.println(mv.toString());
        MovablePoint mv1 = mv.move();
        System.out.println(mv1.toString());
        MovablePoint mv2 = mv.move();
        System.out.println(mv2.toString());
    }
}
