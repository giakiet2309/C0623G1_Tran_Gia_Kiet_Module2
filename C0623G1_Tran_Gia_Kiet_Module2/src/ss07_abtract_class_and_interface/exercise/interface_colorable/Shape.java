package ss07_abtract_class_and_interface.exercise.interface_colorable;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    @Override
    public String toString() {
        return getColor() + isFilled();
    }

}
