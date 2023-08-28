package CaseStudy.service.impl;

import CaseStudy.model.person.Employee;
import CaseStudy.repository.impl.EmployeeRepository;
import CaseStudy.service.IEmployeeService;
import CaseStudy.utils.Regex;
import CaseStudy.utils.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void editEmployee() {

    }

    @Override
    public void searchNameEmployee() {

    }


    @Override
    public void add() {
        String id;
        String name;
        String age;
        String identityNumber;
        String telephone;
        double price;
        boolean checkId = false;
        boolean checkName = false;
        boolean checkAge = false;
        boolean checkIdentityNumber = false;
        boolean checkPrice = false;
        do {
            System.out.println("Nhập mã nhân viên vào đây");
            id = scanner.nextLine();
            if (Regex.validateEmployeeId(id)) {
                checkId = true;
            } else {
                System.out.println("Id không đúng định dạng");
            }
        } while (!checkId);
        do {
            System.out.println("Nhập tên của nhân viên vào đây ");
            name = scanner.nextLine();
            if (Validator.validateName(name)) {
                checkName = true;
            } else {
                System.out.println("Tên không đúng định dạng");
            }
        } while (!checkName);
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.display();
        if (employeeList.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }
    }
}