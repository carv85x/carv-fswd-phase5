package com.app.service;

import java.util.List;

import com.app.model.Customer;
import com.app.model.Login;

public interface CustomerService {
	
	// Basic CRUD
	public Customer createCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer getCustomer(int id);
	public void deleteCustomer(int id);	
	
	// Advanced CRUD
	public Customer getCustomerByUsername(String username);
	public List<Customer> getCustomers();
	public boolean validateLogin(Login login);

}
