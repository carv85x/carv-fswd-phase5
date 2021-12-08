package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Administrator;

public interface AdminRepository extends JpaRepository<Administrator, Integer> {
	
	@Query(value = "SELECT TOP(1)* FROM Administrator a WHERE a.username = ?1 AND a.password = ?2", nativeQuery = true)
	public Administrator validateLogin(String username, String password);

}
