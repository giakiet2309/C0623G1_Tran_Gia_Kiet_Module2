package ss06_inheritance.exercise.ClassPointAndMoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        this(0.0f, 0.0f);
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.setX(x);
        this.setY(y);
    }

    public float getxSpeed() {
        return this.xSpeed;
    }

    public float getySpeed() {
        return this.ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void move() {
        this.setX(this.getX() + this.getxSpeed());
        this.setY(this.getY() + this.getySpeed());
    }

    public String toString() {
        return "Point x = " + this.getX() + " y = " + this.getY() + " / Speed " + this.xSpeed + " - " + this.ySpeed;
    }
}
