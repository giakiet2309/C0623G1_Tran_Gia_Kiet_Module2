package ss15_debug.exercise;

import java.util.Scanner;

public class Test {
    private static void illegalTriangleException(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Nhập cái cạnh nhỏ hơn 0 rồi");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Tổng 2 cạnh lớn hơn cạnh còn lại ");
        }
    }

    public static void main(String[] args) {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập vào cạnh a:");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào cạnh b:");
                int b = scanner.nextInt();
                System.out.println("Nhập vào cạnh c:");
                int c = scanner.nextInt();
                illegalTriangleException(a, b, c);
                System.out.println("OK");
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println(" lỗi , nhập dạng số bạn ơi ");
            }
        } while (true);
    }
}
