package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.DateRange;
import com.app.model.PurchaseOrder;
import com.app.repository.PurchaseOrderRepository;
import com.app.service.PurchaseOrderService;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService{
	
	@Autowired
	PurchaseOrderRepository repo;
	
	@Override
	public PurchaseOrder createPO(PurchaseOrder po) {
		return repo.save(po);
	}

	@Override
	public PurchaseOrder updatePO(PurchaseOrder po) {
		return repo.save(po);
	}

	@Override
	public PurchaseOrder getPO(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void deletePO(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<PurchaseOrder> getAllPOs() {
		return repo.findAll();
	}

	@Override
	public List<PurchaseOrder> getAllPOsByUsername(String username) {
		return repo.findByUsername(username);
	}

	@Override
	public List<PurchaseOrder> getAllPOsByDateRange(DateRange dateRange) {
		return repo.getAllPOsByDateRange(dateRange.getDateFrom(), dateRange.getDateFrom());
	}

	@Override
	public List<PurchaseOrder> getAllPOsByDateRangeAndUser(DateRange dateRange, String username) {
		System.out.println(dateRange.getDateFrom());
		System.out.println(dateRange.getDateThru());
		return repo.getAllPOsByDateRangeAndUser(dateRange.getDateFrom(), dateRange.getDateFrom(), username);
	}

}
