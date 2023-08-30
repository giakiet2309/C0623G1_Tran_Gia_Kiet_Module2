package CaseStudy.repository.impl;

import CaseStudy.model.person.Employee;
import CaseStudy.repository.IEmployeeRepository;
import CaseStudy.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {


    private final String FILE_PATH = "C:\\Users\\Gia Kiet\\Desktop\\C0623G1_Tran_Gia_Kiet_Module2\\C0623G1_Tran_Gia_Kiet_Module2\\src\\CaseStudy\\data\\employee.csv";

    @Override
    public void editEmployee(String id, Employee employee) {
        List<Employee> employeeList = this.display();
        for (Employee p : employeeList) {
            if (p.getId().equals(id)) {
                p.setName(employee.getName());
                p.setDate(employee.getDate());
                p.setGender(employee.getGender());
                p.setCitizenId(employee.getCitizenId());
                p.setTelephone(employee.getCitizenId());
                p.setEmail(employee.getEmail());
                p.setEducationLevel(employee.getEducationLevel());
                p.setPosition(employee.getPosition());
                p.setSalary(employee.getSalary());
                List<String> stringList = converToString(employeeList);
                ReadAndWrite.write(FILE_PATH, stringList);
            }
        }
    }

    @Override
    public List<Employee> searchNameEmployee(String name) {
        List<Employee> newName = this.display();
        List<Employee> result = new ArrayList<>();
        for (Employee employee : newName) {
            if (employee.getName().contains(name)) {
                result.add(employee);
            }
        }
        return result;
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employeeList = this.display();
        employeeList.add(employee);
        List<String> stringList = converToString(employeeList);
        ReadAndWrite.write(FILE_PATH, stringList);
    }

    @Override
    public boolean delete(String e) {
        List<Employee> employeeList = this.display();
        for (Employee p : employeeList) {
            if (p.getId().equals(e)) {
                employeeList.remove(p);
                List<String> strings = converToString(employeeList);
                ReadAndWrite.write(FILE_PATH, strings);
                return true;
            }
        }
        return false;
    }


    @Override
    public List<Employee> display() {
        List<String> stringList = ReadAndWrite.read(FILE_PATH);
        List<Employee> employeeList = new ArrayList<>();
        String[] arr ;
        for (String p : stringList) {
            arr = p.split(",");
            employeeList.add(new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employeeList;
    }

    public static List<String> converToString(List<Employee> employeeList) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getId() + "," + employee.getName() + ","
                    + employee.getDate() + "," + employee.getGender() + "," + employee.getCitizenId()
                    + "," + employee.getTelephone() + "," + employee.getEmail() + ","
                    + employee.getEducationLevel() + "," + employee.getPosition() + ","
                    + employee.getSalary());
        }
        return stringList;
    }

    public boolean checkId(String id) {
        List<Employee> employeeList = this.display();
        for (Employee p : employeeList) {
            if (p.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
