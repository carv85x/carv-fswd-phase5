package com.app.service;

import java.util.List;

import com.app.model.DateRange;
import com.app.model.PurchaseOrder;

public interface PurchaseOrderService {
	
	// Basic CRUD
	public PurchaseOrder createPO(PurchaseOrder po);
	public PurchaseOrder updatePO(PurchaseOrder po);
	public PurchaseOrder getPO(int id);
	public void deletePO(int id);
	
	// Advanced CRUD
	public List<PurchaseOrder> getAllPOs();
	public List<PurchaseOrder> getAllPOsByUsername(String username);
	public List<PurchaseOrder> getAllPOsByDateRange(DateRange dateRange);
	public List<PurchaseOrder> getAllPOsByDateRangeAndUser(DateRange dateRange, String username);
}
