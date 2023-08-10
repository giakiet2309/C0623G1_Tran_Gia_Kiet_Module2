package ss07_abtract_class_and_interface.exercise.interface_colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    public double getArea() {
        return this.getSide() * this.getSide();
    }

    @Override
    public void setWidth(double side) {
        this.setWidth(side);
    }

    @Override
    public void setHeight(double side) {
        this.setHeight(side);
    }

    @Override
    public String toString() {
        return getSide() + super.toString();
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
