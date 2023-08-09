package ss06_inheritance.exercise.CircleAndCylinder;

public class Circle {
    int radius;
    String colour;

    public Circle() {
        this(5, "Green");
    }

    public Circle(int radius, String colour) {
        this.colour = colour;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public String getColour() {
        return this.colour;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public String toString() {
        return "A circle has "
                + "\n  + radius : " + this.getRadius()
                + "\n  + colour : " + this.getColour()
                + "\n  + area : " + this.getArea();
    }
}

