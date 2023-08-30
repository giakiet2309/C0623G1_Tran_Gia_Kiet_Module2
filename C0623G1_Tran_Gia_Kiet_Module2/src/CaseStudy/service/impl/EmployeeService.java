package CaseStudy.service.impl;

import CaseStudy.model.person.Employee;
import CaseStudy.repository.impl.EmployeeRepository;
import CaseStudy.service.IEmployeeService;
import CaseStudy.utils.Regex;
import CaseStudy.utils.Validator;

import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;


public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);

    private static EmployeeService employeeService = new EmployeeService();
    private static EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void editEmployee() {
        String newName;
        String newAge = null;
        String newGender;
        String newIdentityNumber;
        String newTelephone;
        String newEmail;
        String newLevel;
        String newPosition;
        String sub = "";
        double newPrice;
        boolean check;

        System.out.println("Nhập ID của nhân viên muốn sửa");
        String id = scanner.nextLine();
        if (employeeRepository.checkId(id)) {
            do {
                check = false;
                System.out.println("Nhập tên mới của nhân viên vào đây ");
                newName = scanner.nextLine();
                if (Validator.validateName(newName)) {
                    check = true;
                } else {
                    System.out.println("Tên không đúng định dạng");
                }
            } while (!check);
            do {
                try {
                    check = false;
                    System.out.println("Nhập ngày tháng năm sinh của nhân viên mới vào đây");
                    newAge = scanner.nextLine();
                    if (Validator.validateAge(newAge)) {
                        check = true;
                    } else {
                        System.out.println("Tuổi nhân viên phải đủ 18 ");
                    }
                } catch (DateTimeParseException e) {
                    System.out.println(" Ngày tháng gì đấy ?? ");
                }

            } while (!check);
            do {
                check = false;
                System.out.println("Nhập Giới tính nhân viên mới vào đây" + sub + ",Nam-1/Nữ-2");
                newGender = scanner.nextLine();
                if (Regex.checkIsMale(newGender)) {
                    check = true;
                } else {
                    System.out.println("gì đấy");
                }
            } while (!check);
            do {
                check = false;
                System.out.println("Nhập CMND nhân viên mới vào đây");
                newIdentityNumber = scanner.nextLine();
                if (Regex.validateIdentNumber(newIdentityNumber)) {
                    check = true;
                } else {
                    System.out.println("CMND phải đủ 9 hoặc 12 số");
                }
            } while (!check);
            do {
                check = false;
                System.out.println("Nhập số điện thoại nhân viên mới vào đây");
                newTelephone = scanner.nextLine();
                if (Regex.validatePhoneNumber(newTelephone)) {
                    check = true;
                } else {
                    System.out.println("SĐT phải bắt đầu từ 0 và đủ 10 số");
                }
            } while (!check);
            while (true) {
                System.out.println("Mời nhập vào email" + sub);
                newEmail = scanner.nextLine();
                if (Regex.checkEmail(newEmail)) {
                    break;
                }
                System.err.println("Sai format Email ");
            }
            while (true) {
                System.out.println("Mời nhập vào trình độ học vấn" + sub + " : Trung Cấp, Cao Đẳng, Đại Học, Sau Đại Học");
                newLevel = scanner.nextLine();
                if (Regex.checkEducation(newLevel)) {
                    break;
                }
                System.err.println(newLevel + "Không hợp lệ");
            }
            while (true) {
                System.out.println("Mời nhập vào vị trí" + sub + " : Lễ Tân, Phục Vụ, Chuyên Viên, Giám Sát, Quản Lý, Giám Đốc");
                newPosition = scanner.nextLine();
                if (Regex.checkEmployeeType(newPosition)) {
                    break;
                }
                System.err.println(newPosition + "Không hợp lệ");
            }
            do {
                check = false;
                System.out.println("Nhập số tiền lương vào đây");
                newPrice = Double.parseDouble(scanner.nextLine());
                if (newPrice <= 0) {
                    System.out.println("Lương phải lớn hơn ko chứ ! đi làm từ thiện à");
                } else {
                    System.out.println("Sửa Nhân viên thành công !");
                    break;
                }
            } while (!check);
            Employee employee = new Employee(id, newName, newAge, newGender, newIdentityNumber, newTelephone, newEmail, newLevel, newPosition, newPrice);
            employeeRepository.editEmployee(id, employee);
        } else {
            System.out.println("Id không tồn tại");
            employeeService.editEmployee();
        }
    }

    @Override
    public void searchNameEmployee() {
        System.out.println("Nhập tên nhân viên muốn tìm");
        String name = scanner.nextLine();
        for (Employee employee : employeeRepository.searchNameEmployee(name)) {
            System.out.println(employee);
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập ID cần xóa");
        String id = scanner.nextLine();
        if (employeeRepository.delete(id)) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tìm thấy ID");
            employeeService.delete();
        }
    }


    @Override
    public void add() {
        String id;
        String name;
        String age = null;
        String gender;
        String identityNumber;
        String telephone;
        String email;
        String level;
        String position;
        String sub = "";
        double price;
        boolean check;
        do {
            check = false;
            System.out.println("Nhập mã nhân viên vào đây");
            id = scanner.nextLine();
            if (Regex.validateEmployeeId(id)) {
                check = true;
            } else {
                System.out.println("Id không đúng định dạng");
            }
        } while (!check);
        do {
            check = false;
            System.out.println("Nhập tên của nhân viên vào đây ");
            name = scanner.nextLine();
            if (Validator.validateName(name)) {
                check = true;
            } else {
                System.out.println("Tên không đúng định dạng");
            }
        } while (!check);
        do {
            check = false;
            try {
                System.out.println("Nhập ngày tháng năm sinh của nhân viên vào đây");
                age = scanner.nextLine();
                if (Validator.validateAge(age)) {
                    check = true;
                } else {
                    System.out.println("Tuổi nhân viên phải 18 trở lên ");
                }
            } catch (DateTimeParseException e) {
                System.out.println(" Ngày tháng gì đấy ?? VD : dd/MM/yyyy ");
            }

        } while (!check);
        do {
            check = false;
            System.out.println("Nhập Giới tính nhân viên vào đây" + sub + ",Nam-1/Nữ-2");
            gender = scanner.nextLine();
            if (Regex.checkIsMale(gender)) {
                check = true;
            } else {
                System.out.println("gì đấy");
            }
        } while (!check);
        do {
            check = false;
            System.out.println("Nhập CMND nhân viên vào đây");
            identityNumber = scanner.nextLine();
            if (Regex.validateIdentNumber(identityNumber)) {
                check = true;
            } else {
                System.out.println("CMND phải đủ 9 hoặc 12 số");
            }
        } while (!check);
        do {
            check = false;
            System.out.println("Nhập số điện thoại nhân viên vào đây");
            telephone = scanner.nextLine();
            if (Regex.validatePhoneNumber(telephone)) {
                check = true;
            } else {
                System.out.println("SĐT phải bắt đầu từ 0 và đủ 10 số");
            }
        } while (!check);
        while (true) {
            System.out.println("Mời nhập vào email" + sub);
            email = scanner.nextLine();
            if (Regex.checkEmail(email)) {
                break;
            }
            System.err.println("Sai format Email ");
        }
        while (true) {
            System.out.println("Mời nhập vào trình độ học vấn" + sub + " : Trung Cấp, Cao Đẳng, Đại Học, Sau Đại Học");
            level = scanner.nextLine();
            if (Regex.checkEducation(level)) {
                break;
            }
            System.err.println(level + "Không hợp lệ");
        }
        while (true) {
            System.out.println("Mời nhập vào vị trí" + sub + " : Lễ Tân, Phục Vụ, Chuyên Viên, Giám Sát, Quản Lý, Giám Đốc");
            position = scanner.nextLine();
            if (Regex.checkEmployeeType(position)) {
                break;
            }
            System.err.println(position + "Không hợp lệ");
        }
        do {
            check = false;
            System.out.println("Nhập số tiền lương vào đây");
            price = Double.parseDouble(scanner.nextLine());
            if (price <= 0) {
                System.out.println("Lương phải lớn hơn ko chứ ! đi làm từ thiện à");
            } else {
                System.out.println("ADD Nhân viên thành công !");
                break;
            }
        } while (!check);
        Employee employee = new Employee(id, name, age, gender, identityNumber, telephone, email, level, position, price);
        employeeRepository.add(employee);
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