package ss05_Accessmodifier_staticmethod_staticproperty.exercise.Access_modifier;


public class Circle {
    private double radius;
    private String color;

    private Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

}
