package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.model.Login;
import com.app.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;

	@PostMapping("/customer")
	public Customer createUser(@RequestBody Customer customer) {
		try {
			return service.createCustomer(customer);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@PutMapping("/customer")
	public int updateUser(@RequestBody Customer customer) {
		try {
			service.updateCustomer(customer);
			// Returns 0 to confirm Customer account was updated
			return 0;
		} catch(Exception e) {
			System.out.println(e);
			// Returns -1 to report Customer account was NOT updated
			return -1;
		}
	}

	@GetMapping("/customer/{id}")
	public Customer getUser(@PathVariable int id) {
		try {
			return service.getCustomer(id);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}	
	}

	@DeleteMapping("/customer/{id}")
	public int deleteUser(@PathVariable int id) {
		try {
			service.deleteCustomer(id);
			// Returns 0 to confirm Customer account was deleted
			return 0;
		} catch(Exception e) {
			System.out.println(e);
			// Returns -1 to report Customer account was NOT deleted
			return -1;
		}		
	}

	@GetMapping("/customer/username/{username}")
	public Customer getUserByUsername(@PathVariable String username) {
		try {
			return service.getCustomerByUsername(username);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}		
	}

	@GetMapping("/customers")
	public List<Customer> getUsers() {
		try {
			return service.getCustomers();
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}	
	}

	@PostMapping("/customer/login")
	public boolean validateUser(@RequestBody Login login) {
		try {
			return service.validateLogin(login);
		} catch(Exception e) {
			System.out.println(e);	
			return false;
		}		
	}

}
