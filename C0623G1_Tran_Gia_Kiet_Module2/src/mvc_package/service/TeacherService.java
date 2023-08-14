package mvc_package.service;

import mvc_package.model.Person;
import mvc_package.model.Teacher;
import mvc_package.repository.IStudentRepo;
import mvc_package.repository.ITeacherRepo;
import mvc_package.repository.TeacherRepo;
import sun.applet.AppletResourceLoader;

import java.util.List;
import java.util.Scanner;

public class TeacherService  implements ITeacherService{
    private static ITeacherRepo teacherRepo = new TeacherRepo();
Scanner scanner = new Scanner(System.in);
    @Override
    public void addTeacher() {
        System.out.println("Nhập id giảng viên vào : ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên giảng viên vào đây");
        String name = scanner.nextLine();
        System.out.println("Nhập sinh nhật giảng viên vào đây");
        String dob = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập vai trò của giảng viên vào đây");
        String profession = scanner.nextLine();
        Person teacher = new Teacher(id,name,dob,gender,profession);
        teacherRepo.addTeacher(teacher);
    }

    @Override
    public void removeTeacher() {

    }

    @Override
    public void displayTeacher() {
        List<Person> teacherList = teacherRepo.displayTeacher();
        for (Person teacher: teacherList) {
            System.out.println(teacher);
        }



    }
}
