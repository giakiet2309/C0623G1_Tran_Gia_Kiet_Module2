package ss03_array_method_java.exercise;

import java.util.Scanner;


public class AddItem {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8};
        print(arr);

        System.out.println("");
        System.out.print("Bạn muốn thêm số nào : ");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        System.out.print("Ở vị trí nào : ");
        int index = Integer.parseInt(scanner.nextLine());

        print(add(arr, num, index));

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    public static int[] add(int[] arr, int num, int index) {
        int[] newArr = new int[arr.length + 1];
        if (index < 0 || index > arr.length - 1) {
            System.out.println("không chèn được phần tử vào mảng");
            return arr;
        } else {
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = num;
            for (int i = index + 1; i < newArr.length; i++) {
                newArr[i] = arr[i - 1];
            }
            return newArr;
        }
    }
}
