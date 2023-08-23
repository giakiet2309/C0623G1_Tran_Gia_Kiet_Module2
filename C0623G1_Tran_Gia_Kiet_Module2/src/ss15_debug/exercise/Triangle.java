package ss15_debug.exercise;

public class Triangle {
    private int sideA;

    private int sideB;

    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) throws IllegalTriangleException {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalTriangleException("Cạnh Phải lớn hơn 0 ");
        }
        if (sideA + sideB < sideC || sideA + sideC < sideC || sideB + sideC < sideA) {
            throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
