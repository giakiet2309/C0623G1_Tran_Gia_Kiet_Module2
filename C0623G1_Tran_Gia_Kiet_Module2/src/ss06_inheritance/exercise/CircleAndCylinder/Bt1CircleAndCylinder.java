package ss06_inheritance.exercise.CircleAndCylinder;

public class Bt1CircleAndCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10, "White");

        System.out.println(circle1);
        System.out.println(circle2);

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(18, 15, "Brown");

        System.out.println(cylinder1);
        System.out.println(cylinder2);
    }
}
