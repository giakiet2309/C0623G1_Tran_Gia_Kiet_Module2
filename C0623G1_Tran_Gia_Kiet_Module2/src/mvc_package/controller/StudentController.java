package mvc_package.controller;

import mvc_package.service.IStudentService;
import mvc_package.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService studentService = new StudentService();
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("Chương Trình Quản Lí Sinh Viên");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("không hợp lệ vui lòng nhập lại b ơi");
            }
        }while (true);
    }

}