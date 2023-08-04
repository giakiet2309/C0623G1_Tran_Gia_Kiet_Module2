package ss03_array_method_java.exercise;


import java.util.Scanner;

public class DeteleItemInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng:");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        System.out.println("Nhập giá trị cho các phần tử mảng.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị phần tử thứ: " + i);
            arr[i] = scanner.nextInt();
        }

        System.out.println("Nhập vào giá trị phần tử cần xóa");
        int x = scanner.nextInt();

        boolean flag = false;
        int index = 1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;
                index = i;
                count = i;
            }
        }
        if (count > 0) {
            System.out.printf("Vị trí của X trong mảng là :  " + count + "\n");
        } else {
            System.out.printf("Không có trong mảng");
        }
        if (flag) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
            System.out.println("Mảng sau khi xóa đi phần tử:");
            for (int value : arr) {
                System.out.println(value);
            }
        }
    }
}
