package ss06_inheritance.exercise.ClassPointAndMoveablePoint;

public class PointAndMoveablePoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(1561, 1611);
        MovablePoint point3 = new MovablePoint();
        MovablePoint point4 = new MovablePoint(25, 26);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println(point4);

        System.out.println("Training");
        System.out.println(point4);
        point4.move();
        System.out.println(point4);
        point4.move();
        System.out.println(point4);
    }


}
