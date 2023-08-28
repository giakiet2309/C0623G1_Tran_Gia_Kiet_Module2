package CaseStudy.service;

import CaseStudy.model.person.Customer;

public interface ICustomerService extends IFuramaService<Customer> {
    void editCustomer();
    void searchNameCustomer();
}
