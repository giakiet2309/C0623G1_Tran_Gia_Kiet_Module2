package ss07_abtract_class_and_interface.practice.interface_comparable;




public class ComparabelCircle extends Circle implements Comparable<Circle> {
    public ComparabelCircle() {

    }

    public ComparabelCircle(double radius) {
        super(radius);
    }

    public ComparabelCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getRadius() > o.getRadius()) {
            return 1;
        } else if (this.getRadius() < o.getRadius()) {
            return -1;
        } else return 1;
    }
}