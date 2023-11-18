package Exercise.OOP;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        f1.setSpeed(FAST);
        f1.setRadius(10);
        f1.setOn(true);
        f1.setColor("Yellow");
        System.out.println(f1.toString());
        f2.setSpeed(MEDIUM);
        f2.setRadius(5);
        System.out.println(f2.toString());
    }
}
