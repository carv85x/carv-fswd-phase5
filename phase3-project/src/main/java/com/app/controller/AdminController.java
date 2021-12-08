package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Administrator;
import com.app.model.Login;
import com.app.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService service;
	
	@PostMapping("/admin")
	public Administrator createAdmin(@RequestBody Administrator admin) {
		try {
			return service.createAdmin(admin);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}	
	}

	@PutMapping("/admin")
	public int updateAdmin(@RequestBody Administrator admin) {
		try {
			service.updateAdmin(admin);
			// Returns 0 to confirm Admin account was updated
			return 0;
		} catch(Exception e) {
			System.out.println(e);
			// Returns -1 to report Admin account was NOT updated
			return -1;
		}	
		
	}

	@GetMapping("/admin/{id}")
	public Administrator getAdmin(@PathVariable int id) {
		try {
			return service.getAdmin(id);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}		
	}

	@DeleteMapping("/admin/{id}")
	public int deleteAdmin(@PathVariable int id) {
		try {
			service.deleteAdmin(id);
			// Returns 0 to confirm Admin account was deleted
			return 0;
		} catch(Exception e) {
			System.out.println(e);
			// Returns -1 to report Admin account was NOT deleted
			return -1;
		}				
	}

	@PostMapping("/admin/login")
	public boolean validateLogin(@RequestBody Login login) {
		try {
			return service.validateLogin(login);
		} catch(Exception e) {
			System.out.println(e);	
			return false;
		}			
	}

}
