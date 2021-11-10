package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(1, "tuan", "444", "ha tinh"));
    }
    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public Customer findById(int id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id){
                return customerList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Customer customer) {
//        for (int i = 0; i < customerList.size(); i++) {
//            if (customerList.get(i).getId() == id){
//                customerList.set(i, customer);
//            }
//        }
    }

    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }
}
