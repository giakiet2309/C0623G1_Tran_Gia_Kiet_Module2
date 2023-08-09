package ss06_inheritance.exercise.Point2DAndPoint3D;

public class Point2D {
    float x;

    float y;

    public Point2D() {
        this(0.0f, 0.0f);
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Giá trị của x = " + this.x
                + " Giá trị của y = " + this.y;
    }
}
