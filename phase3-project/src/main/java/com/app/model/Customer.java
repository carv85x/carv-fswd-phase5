package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NaturalId
	private String username;
	private String password;
	private String email;
	private String nameFirst;
	private String nameLast;
	private String address;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNameFirst() {
		return nameFirst;
	}
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}
	
	public String getNameLast() {
		return nameLast;
	}
	
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", nameFirst=" + nameFirst + ", nameLast=" + nameLast + ", address=" + address + "]";
	}
}
