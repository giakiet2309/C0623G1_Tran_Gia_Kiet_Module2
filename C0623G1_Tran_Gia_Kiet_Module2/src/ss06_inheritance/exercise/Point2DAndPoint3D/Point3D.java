package ss06_inheritance.exercise.Point2DAndPoint3D;

public class Point3D extends Point2D {
   private float z;


    public Point3D(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public Point3D() {
        this(0.0f, 0.0f, 0.0f);
    }


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), this.z};
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public String toString() {
        return "Giá trị của x = " + this.getX()
                + " Giá trị của y = " + this.getY()
                + " Giá trị của z = " + this.z;
    }
}
