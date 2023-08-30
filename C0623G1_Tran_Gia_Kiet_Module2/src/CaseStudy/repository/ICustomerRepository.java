package CaseStudy.repository;

import CaseStudy.model.person.Customer;
import CaseStudy.model.person.Employee;

import java.util.List;

public interface ICustomerRepository extends IFurameRepo<Customer> {
    void editCustomer(String id , Customer customer);

    List<Customer> searchNameCustomer(String string);
}
