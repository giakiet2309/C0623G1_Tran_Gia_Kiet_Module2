package ss03_array_method_java.exercise;


public class MaxValueIn2DimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}};
        print(array);
        System.out.println("Max in Array is " + max(array));
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    System.out.println(" " + arr[i][j]);
                } else {
                    System.out.print(" " + arr[i][j]);
                }
            }
        }
    }
    public static int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
