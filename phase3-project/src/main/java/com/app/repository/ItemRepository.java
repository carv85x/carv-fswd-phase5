package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	@Query(value = "SELECT TOP(1)* FROM Item i WHERE i.name = ?1", nativeQuery = true)
	public Item getItemByName(String name);
	
	public List<Item> findByCategory(String category);
	
	@Query(value = "SELECT * FROM Item i WHERE i.price >= ?1 AND i.price <= ?2", nativeQuery = true)
	public List<Item> getItemsByPriceRange(double priceMin, double priceMax);
	
}
