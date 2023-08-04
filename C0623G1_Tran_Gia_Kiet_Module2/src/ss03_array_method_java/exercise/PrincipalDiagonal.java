package ss03_array_method_java.exercise;


import java.util.Scanner;

public class PrincipalDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;

        while (true) {
            System.out.println("Nhập độ dài của ma trận vuông : ");
            length = Integer.parseInt(scanner.nextLine());
            if (length > 0) {
                break;
            }
            System.out.println("Độ dài phải > 0 ");
        }
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("Nhập giá trị ở vị trí " + i + " - " + j);
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        print(array);
        System.out.println("Tổng đường chéo chính = " + sumPrincipalDiagonal(array));
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
    }

    public static int sumPrincipalDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}
