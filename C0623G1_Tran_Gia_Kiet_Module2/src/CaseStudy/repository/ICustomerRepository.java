package CaseStudy.repository;

import CaseStudy.model.person.Customer;

public interface ICustomerRepository extends IFurameRepo<Customer> {
    void editCustomer();

    void searchNameCustomer();
}
