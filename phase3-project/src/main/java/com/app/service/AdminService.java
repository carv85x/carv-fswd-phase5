package com.app.service;

import com.app.model.Administrator;
import com.app.model.Login;

public interface AdminService {
	
	// Basic CRUD
	public Administrator createAdmin(Administrator admin);
	public Administrator updateAdmin(Administrator admin);
	public Administrator getAdmin(int id);	
	public void deleteAdmin(int id);	

	// Advanced CRUD
	public boolean validateLogin(Login login);
}
