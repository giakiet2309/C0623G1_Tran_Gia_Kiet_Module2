package ss06_inheritance.exercise.CircleAndCylinder;

public class Cylinder extends Circle {
    private int height;

    public Cylinder() {
        this.height = 6;
    }

    public Cylinder(int radius, int height, String colour) {
        this.radius = radius;
        this.height = height;
        this.colour = colour;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.getHeight();
    }

    @Override
    public String toString() {
        return "A cylinder has "
                + "\n  + radius : " + this.getRadius()
                + "\n  + height : " + this.getHeight()
                + "\n  + colour : " + this.getColour()
                + "\n  + volume : " + this.getVolume();
    }
}
