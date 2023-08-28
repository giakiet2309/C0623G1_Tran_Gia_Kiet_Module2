package CaseStudy.service;

import CaseStudy.model.person.Employee;

public interface IEmployeeService extends IFuramaService <Employee> {
    void editEmployee();
    void searchNameEmployee();
}
