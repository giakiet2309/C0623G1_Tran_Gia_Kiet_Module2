package ss04_class_and_obj_in_java.exercise.QuadraticEquationn;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(Math.pow(this.b, 2) - 4 * this.a * this.c, 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(Math.pow(this.b, 2) - 4 * this.a * this.c, 0.5)) / (2 * this.a);
    }

    public String getResult() {
        if (getDiscriminant() > 0) {
            return " The equation has two roots " + getRoot1() + " and " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return " The equation has one roots " + getRoot1();
        } else {
            return "The equation has no real roots";
        }
    }
}
