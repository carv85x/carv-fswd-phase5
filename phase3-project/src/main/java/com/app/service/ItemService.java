package com.app.service;

import java.util.List;

import com.app.model.Item;
import com.app.model.PriceRange;

public interface ItemService {
	
	// Basic CRUD
	public Item createItem(Item item);
	public Item updateItem(Item item);
	public Item getItem(int id);
	public void deleteItem(int id); 
	
	// Advanced CRUD
	public Item getItemByName(String name);
	public List<Item> getItems();
	public List<Item> getItemsByCategory(String category);
	public List<Item> getItemsByPriceRange(PriceRange priceRange);

}
