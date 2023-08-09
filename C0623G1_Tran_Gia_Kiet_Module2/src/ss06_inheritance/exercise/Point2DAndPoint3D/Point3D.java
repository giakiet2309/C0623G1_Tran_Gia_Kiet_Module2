package ss06_inheritance.exercise.Point2DAndPoint3D;

public class Point3D extends Point2D {
    float z;


    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
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
        return new float[]{this.x, this.y, this.z};
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "Giá trị của x = " + this.x
                + " Giá trị của y = " + this.y
                + " Giá trị của z = " + this.z;
    }
}
