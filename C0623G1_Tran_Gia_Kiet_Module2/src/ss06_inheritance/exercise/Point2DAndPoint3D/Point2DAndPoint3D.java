package ss06_inheritance.exercise.Point2DAndPoint3D;


import java.util.Arrays;

public class Point2DAndPoint3D {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        Point2D point2 = new Point2D(10, 99);


        Point3D point3 = new Point3D();
        Point3D point4 = new Point3D(1000, 2000, 3000);


        System.out.println(point1);
        System.out.println(Arrays.toString(point1.getXY()));
        System.out.println(point2);
        System.out.println(Arrays.toString(point2.getXY()));
        System.out.println(point3);
        System.out.println(Arrays.toString(point3.getXYZ()));
        System.out.println(point4);
        System.out.println(Arrays.toString(point4.getXYZ()));


    }
}
