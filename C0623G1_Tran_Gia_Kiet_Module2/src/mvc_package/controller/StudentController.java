package mvc_package.controller;

import mvc_package.model.Student;
import mvc_package.service.IStudentService;
import mvc_package.service.StudentService;
import ss01_introduction_to_java.practice.Main;

import java.util.Scanner;

public class StudentController {
    private static IStudentService studentService = new StudentService();
    public static void showStudentController() {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("Chương Trình Quản Lí Sinh Viên");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Xóa học sinh");
            System.out.println("3. Xem danh sách học sinh");
            System.out.println("4. Trở về trang chính");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    break;
                case 3:
                    studentService.displayStudent();
                    break;
                case 4:
                    MainController.showMenu();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("không hợp lệ vui lòng nhập lại b ơi");
            }
        } while (true);
    }
}
