package mvc_package.controller;

import java.util.Scanner;

public class TeacherController {
    public static void showTeacherController() {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("Chương Trình Quản Lí Giảng Viên");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm giảng viên");
            System.out.println("2. Xóa giảng viên");
            System.out.println("3. Xem danh sách giảng viên");
            System.out.println("4. Trở về trang chính");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("không hợp lệ vui lòng nhập lại b ơi");
            }
        } while (true);
    }
}