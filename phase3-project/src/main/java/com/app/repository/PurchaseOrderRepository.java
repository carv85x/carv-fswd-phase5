package com.app.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {
	
	public List<PurchaseOrder> findByUsername(String username);
	
	@Query(value = "SELECT * FROM Purchase_Order p WHERE p.Date_Purchase >= ?1 AND p.Date_Purchase <= ?2", nativeQuery = true)
	public List<PurchaseOrder> getAllPOsByDateRange(Date dateFrom, Date dateThru);
	
	@Query(value = "SELECT * FROM Purchase_Order p WHERE p.Date_Purchase >= ?1 AND p.Date_Purchase <= ?2 AND p.username = ?3", nativeQuery = true)
	public List<PurchaseOrder> getAllPOsByDateRangeAndUser(Date dateFrom, Date dateThru, String username);
}
