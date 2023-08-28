package CaseStudy.repository.impl;

import CaseStudy.model.person.Employee;
import CaseStudy.repository.IEmployeeRepository;
import CaseStudy.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String FILE_PATH = "C:\\Users\\Gia Kiet\\Desktop\\C0623G1_Tran_Gia_Kiet_Module2\\C0623G1_Tran_Gia_Kiet_Module2\\src\\CaseStudy\\data\\employee.csv";

    @Override
    public void editEmployee() {

    }

    @Override
    public void searchNameEmployee() {

    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public List<Employee> display() {
        List<String> stringList = ReadAndWrite.read(FILE_PATH);
        List<Employee> employeeList = new ArrayList<>();
        String[] arr = null;
        for (String p : stringList) {
            arr = p.split(",");
            employeeList.add(new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employeeList;
    }

}
