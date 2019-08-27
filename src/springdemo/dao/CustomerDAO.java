package springdemo.dao;

import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
  