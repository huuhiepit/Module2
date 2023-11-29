package Exercise.inheritance;

public class Point3D extends Point2D{
    private float z;

    Point3D() {}
    Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), this.z};
    }

    @Override
    public String toString() {
        return String.format("(%.1f, %.1f, %.1f)", super.getX(), super.getY(), this.z);
    }
}
