package ss15_debug.exercise;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        int aa;
        int bb;
        int cc;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Nhập vào cạnh a:");
            String a = scanner.nextLine();
            do {
                try {
                    aa = Integer.parseInt(a);
                    if (aa <= 0) {
                        System.out.println("Nhập cạnh nhỏ hơn 0 rồi");
                        System.out.println("Nhập lại cạnh a:");
                        aa = Integer.parseInt(scanner.nextLine());
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng, nhập lại!");
                    aa = Integer.parseInt(scanner.nextLine());
                }
            } while (aa <= 0);

            System.out.println("Nhập vào cạnh b:");
            String b = scanner.nextLine();

            do {
                try {
                    bb = Integer.parseInt(b);
                    if (bb <= 0) {
                        System.out.println("Nhập cạnh nhỏ hơn 0 rồi");
                        System.out.println("Nhập lại cạnh b:");
                        bb = Integer.parseInt(scanner.nextLine());
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng, nhập lại!");
                    bb = Integer.parseInt(scanner.nextLine());
                }
            } while (bb <= 0);

            System.out.println("Nhập vào cạnh c:");
            String c = scanner.nextLine();
            do {
                try {
                    cc = Integer.parseInt(c);
                    if (cc <= 0) {
                        System.out.println("Nhập cạnh nhỏ hơn 0 rồi");
                        System.out.println("Nhập lại cạnh c:");
                        cc = Integer.parseInt(scanner.nextLine());
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng, nhập lại!");
                    cc = Integer.parseInt(scanner.nextLine());
                }
            } while (cc <= 0);

            if (aa + bb < cc || aa + cc < bb || bb + cc < aa) {
                System.out.println("Tổng 2 cạnh lớn hơn cạnh còn lại ");
                System.out.println("Nhập lại cạnh a:");
                aa = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập lại cạnh b:");
                bb = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập lại cạnh c:");
                cc = Integer.parseInt(scanner.nextLine());
            }

            System.out.println("OK");
        } while (aa + bb <= cc || aa + cc <= bb || bb + cc <= aa);
    }
}