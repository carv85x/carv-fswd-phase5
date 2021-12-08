package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Administrator;
import com.app.model.Login;
import com.app.repository.AdminRepository;
import com.app.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository repo;
	
	@Override
	public Administrator createAdmin(Administrator admin) {
		repo.save(admin);
		// Blank out password
		admin.setPassword("");
		return admin;
	}

	@Override
	public Administrator updateAdmin(Administrator admin) {
		return repo.save(admin);
	}

	@Override
	public Administrator getAdmin(int id) {
		Administrator admin = repo.findById(id).get();
		// Blank out password
		admin.setPassword("");
		return admin;
	}

	@Override
	public void deleteAdmin(int id) {
		repo.deleteById(id);
	}

	@Override
	public boolean validateLogin(Login login) {
		if(repo.validateLogin(login.getUsername(), login.getPassword()) != null)
			return true;
		else
			return false;
	}

}
