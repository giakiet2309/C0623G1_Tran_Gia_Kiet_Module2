package CaseStudy.repository;

import CaseStudy.model.person.Employee;

public interface IEmployeeRepository extends IFurameRepo<Employee> {
    void editEmployee();

    void searchNameEmployee();
}
