package ss17_io_binary_file_and_serialization.exercise.product_management.controller;

import java.util.Scanner;

public class MainController {
    public static void showMenu() {

        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("Chương Trình Quản Lý Sản Phẩm");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Hiển thị danh sách sản phẩm ");
            System.out.println("3. Tìm kiếm sản phẩm theo tên");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng : ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Nhập lại");
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

}
