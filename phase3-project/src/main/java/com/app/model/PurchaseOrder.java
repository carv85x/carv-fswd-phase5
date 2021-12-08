package com.app.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PurchaseOrder {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private Date datePurchase;
	private double total;
	
	@ElementCollection
	private List<PurchaseItem> pItems;
	private String status;
	
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
	
	public Date getDatePurchase() {
		return datePurchase;
	}
	
	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public List<PurchaseItem> getItems() {
		return pItems;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setItems(List<PurchaseItem> pItems) {
		this.pItems = pItems;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [id=" + id + ", username=" + username + ", datePurchase=" + datePurchase + ", total="
				+ total + ", pItems=" + pItems + ", status=" + status + "]";
	}
	
}
