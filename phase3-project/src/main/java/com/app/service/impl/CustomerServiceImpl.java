package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.model.Login;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository repo;
	
	@Override
	public Customer createCustomer(Customer customer) {
		repo.save(customer);
		// Blank out password
		customer.setPassword("");
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		Customer customer = repo.findById(id).get();
		// Blank out password
		customer.setPassword("");
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		repo.deleteById(id);		
	}

	@Override
	public Customer getCustomerByUsername(String username) {
		Customer customer = repo.getCustomerByUsername(username);
		// Blank out password
		customer.setPassword("");
		return customer;
	}

	@Override
	public boolean validateLogin(Login login) {
		if(repo.validateLogin(login.getUsername(), login.getPassword()) != null)
			return true;
		else
			return false;
	}

	@Override
	public List<Customer> getCustomers() {
		return repo.findAll();
	}

}
