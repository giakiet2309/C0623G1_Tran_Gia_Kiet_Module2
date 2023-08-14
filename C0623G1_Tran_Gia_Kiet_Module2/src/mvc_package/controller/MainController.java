package mvc_package.controller;

import mvc_package.service.IStudentService;
import mvc_package.service.StudentService;

import java.util.Scanner;

public class MainController {
    private static IStudentService studentService = new StudentService();

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("Chương Trình Quản Lí Sinh Viên");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Menu sinh viên ");
            System.out.println("2. Menu giảng viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    StudentController.showStudentController();
                    break;
                case 2:
                    TeacherController.showTeacherController();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("không hợp lệ vui lòng nhập lại b ơi");
            }
        } while (true);
    }

}