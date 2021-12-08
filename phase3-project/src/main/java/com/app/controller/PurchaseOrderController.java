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

import com.app.model.DateRange;
import com.app.model.PurchaseOrder;
import com.app.service.PurchaseOrderService;

@RestController
public class PurchaseOrderController {
	
	@Autowired
	PurchaseOrderService service;

	@PostMapping("/po")
	public PurchaseOrder createPO(@RequestBody PurchaseOrder po) {
		try {
			return service.createPO(po);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@PutMapping("/po")
	public PurchaseOrder updatePO(@RequestBody PurchaseOrder po) {
		try {
			return service.updatePO(po);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@GetMapping("/po/{id}")
	public PurchaseOrder getPO(@PathVariable int id) {
		try {
			return service.getPO(id);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}	
	}

	@DeleteMapping("/po/{id}")
	public int deletePO(@PathVariable int id) {
		try {
			service.deletePO(id);
			// Returns 0 to confirm PO account was deleted
			return 0;
		} catch(Exception e) {
			System.out.println(e);
			// Returns -1 to report PO account was NOT deleted
			return -1;
		}
	}

	@GetMapping("/pos")
	public List<PurchaseOrder> getAllPOs() {
		try {
			return service.getAllPOs();
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}	
	}

	@GetMapping("/pos/{username}")
	public List<PurchaseOrder> getAllPOsByUsername(@PathVariable String username) {
		try {
			return service.getAllPOsByUsername(username);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}	
	}

	@GetMapping("/pos/date_range")
	public List<PurchaseOrder> getAllPOsByDateRange(@RequestBody DateRange dateRange) {
		try {
			return service.getAllPOsByDateRange(dateRange);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}	
	}

	@GetMapping("/pos/date_range/{username}")
	public List<PurchaseOrder> getAllPOsByDateRangeAndUser(@RequestBody DateRange dateRange, @PathVariable String username) {
		try {
			return service.getAllPOsByDateRangeAndUser(dateRange, username);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
