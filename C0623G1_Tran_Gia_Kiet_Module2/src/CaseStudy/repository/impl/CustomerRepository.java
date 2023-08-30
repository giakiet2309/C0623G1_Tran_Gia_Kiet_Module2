package CaseStudy.repository.impl;

import CaseStudy.model.person.Customer;
import CaseStudy.model.person.Employee;
import CaseStudy.repository.ICustomerRepository;
import CaseStudy.service.ICustomerService;
import CaseStudy.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String FILE_PATH = "C:\\Users\\Gia Kiet\\Desktop\\C0623G1_Tran_Gia_Kiet_Module2\\C0623G1_Tran_Gia_Kiet_Module2\\src\\CaseStudy\\data\\customer.csv";

    @Override
    public void editCustomer(String id, Customer customer) {
        List<Customer> customerList = this.display();
        for (Customer p : customerList) {
            if (p.getId().equals(id)) {
                p.setName(customer.getName());
                p.setDate(customer.getDate());
                p.setEmail(customer.getEmail());
                p.setGender(customer.getGender());
                p.setCitizenId(customer.getCitizenId());
                p.setTelephone(customer.getTelephone());
                p.setAddress(customer.getAddress());
                p.setTypeOfCustomer(customer.getTypeOfCustomer());
                List<String> stringList = converToString(customerList);
                ReadAndWrite.write(FILE_PATH, stringList);
            }
        }
    }

    @Override
    public List<Customer> searchNameCustomer(String name) {
        List<Customer> newName = this.display();
        List<Customer> result = new ArrayList<>();
        for (Customer customer : newName) {
            if (customer.getName().contains(name)) {
                result.add(customer);
            }
        }
        if (result.isEmpty()) {
            return null;
        }
        return result;
    }

    @Override
    public void add(Customer customer) {
        List<Customer> customerList = this.display();
        customerList.add(customer);
        List<String> stringList = converToString(customerList);
        ReadAndWrite.write(FILE_PATH, stringList);
    }

    @Override
    public boolean delete(String id) {
        List<Customer> customerList = this.display();
        for (Customer p : customerList) {
            if (p.getId().equals(id)) {
                customerList.remove(p);
                List<String> strings = converToString(customerList);
                ReadAndWrite.write(FILE_PATH, strings);
                return true;
            }
        }
        return false;
    }


    @Override
    public List<Customer> display() {
        List<String> stringList = ReadAndWrite.read(FILE_PATH);
        List<Customer> customerList = new ArrayList<>();
        String[] arr = null;
        for (String p : stringList) {
            arr = p.split(",");
            customerList.add(new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return customerList;
    }

    public static List<String> converToString(List<Customer> customerList) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getId() + "," + customer.getName() + "," + customer.getDate() + "," + customer.getGender() + "," + customer.getCitizenId() + "," + customer.getTelephone() + "," + customer.getEmail() + "," + customer.getTypeOfCustomer() + "," + customer.getAddress());
        }
        return stringList;
    }

    public boolean checkId(String id) {
        List<Customer> customerList = this.display();
        for (Customer p : customerList) {
            if (p.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
