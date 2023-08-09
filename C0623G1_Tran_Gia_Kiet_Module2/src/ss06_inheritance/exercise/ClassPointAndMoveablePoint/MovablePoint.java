package ss06_inheritance.exercise.ClassPointAndMoveablePoint;

public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;

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
        this.x = x;
        this.y = y;
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
        this.x += this.xSpeed;
        this.y += this.ySpeed;
    }

    public String toString() {
        return "Point x = " + this.x + " y = " + this.y + " / Speed " + this.xSpeed + " - " + this.ySpeed;
    }
}
