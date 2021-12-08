package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.app.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query(value = "SELECT TOP(1)* FROM Customer c WHERE c.username = ?1", nativeQuery = true)
	public Customer getCustomerByUsername(String username);
	
	@Query(value = "SELECT TOP(1)* FROM Customer c WHERE c.username = ?1 AND c.password = ?2", nativeQuery = true)
	public Customer validateLogin(String username, String password);
}
