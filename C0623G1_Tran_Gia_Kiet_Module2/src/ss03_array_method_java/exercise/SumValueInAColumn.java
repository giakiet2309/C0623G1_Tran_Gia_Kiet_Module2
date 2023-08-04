package ss03_array_method_java.exercise;



import java.util.Scanner;

public class SumValueInAColumn {
    public static void main(String[] args) {
        int[][] arr = {{8,5,2,3,6,9}, {4,5,2,3,6,8}, {4,5,2,3,6,8}, {4,1,2,3,6,5}, {7,8,5,4,1,2}, {8,6,5,5,4,1}, {9,8,5,6,3,0}, {8,9,6,5,1,2}};
        print(arr);
        System.out.println("Bạn muốn tính tổng cột nào");
        Scanner scanner = new Scanner(System.in);
        int column = scanner.nextInt();
        if (column < 0 || column >= arr[0].length){
            System.out.println("Không có cột " + column);
        } else {
            System.out.println("Sum of column " + column + " = " + sum(arr, column));
        }
    }
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static int sum(int[][] arr, int column){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i][column];
        }
        return sum;
    }
}
