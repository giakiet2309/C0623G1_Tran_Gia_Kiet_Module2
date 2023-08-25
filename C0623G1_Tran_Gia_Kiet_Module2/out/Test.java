import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào cạnh a:");
        int a = scanner.nextInt();

        if (a <= 0) {
            System.out.println("Nhập cái cạnh nhỏ hơn 0 rồi");
            System.out.println("Nhập lại cạnh a:");
            a = scanner.nextInt();
        }

        System.out.println("Nhập vào cạnh b:");
        int b = scanner.nextInt();

        if (b <= 0) {
            System.out.println("Nhập cái cạnh nhỏ hơn 0 rồi");
            System.out.println("Nhập lại cạnh b:");
            b = scanner.nextInt();
        }

        System.out.println("Nhập vào cạnh c:");
        int c = scanner.nextInt();

        if (c <= 0) {
            System.out.println("Nhập cái cạnh nhỏ hơn 0 rồi");
            System.out.println("Nhập lại cạnh c:");
            c = scanner.nextInt();
        }

        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Tổng 2 cạnh lớn hơn cạnh còn lại ");
            System.out.println("Nhập lại cạnh a:");
            a = scanner.nextInt();
            System.out.println("Nhập lại cạnh b:");
            b = scanner.nextInt();
            System.out.println("Nhập lại cạnh c:");
            c = scanner.nextInt();
        }

        System.out.println("OK");
    }
}