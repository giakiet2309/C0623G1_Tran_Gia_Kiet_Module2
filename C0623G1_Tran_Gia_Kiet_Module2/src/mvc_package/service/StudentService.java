package mvc_package.service;

import mvc_package.model.Person;
import mvc_package.model.Student;
import mvc_package.repository.IStudentRepo;
import mvc_package.repository.StudentRepo;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static IStudentRepo studentRepo = new StudentRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addStudent() {
        System.out.println("Nhập ID học sinh vào : ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên học sinh vào đây");
        String name = scanner.nextLine();
        System.out.println("Nhập sinh nhật học sinh vào đây");
        String dob = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập lớp của học sinh ");
        String classStudent = scanner.nextLine();
        System.out.println("Nhập điểm học sinh vào đây");
        int point = Integer.parseInt(scanner.nextLine());
        Person student = new Student(id, name, dob, gender, classStudent, point);
        studentRepo.addStudent(student);
    }


    @Override
    public void removeStudent() {

    }


    @Override
    public void displayStudent() {
        List<Person> studentList = studentRepo.displayStudent();
        for (Person student : studentList){
            System.out.println(student);
        }
    }


}
