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

import com.app.model.Item;
import com.app.model.PriceRange;
import com.app.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService service;
	
	@PostMapping("/item")
	public Item createItem(@RequestBody Item item) {
		try {
			return service.createItem(item);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@PutMapping("/item")
	public Item updateItem(@RequestBody Item item) {
		try {
			return service.updateItem(item);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@GetMapping("/item/{id}")
	public Item getItem(@PathVariable int id) {
		try {
			return service.getItem(id);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@DeleteMapping("/item/{id}")
	public int deleteItem(@PathVariable int id) {
		try {
			service.deleteItem(id);
			// Returns 0 to confirm Customer account was deleted
			return 0;
		} catch(Exception e) {
			System.out.println(e);
			// Returns -1 to report Customer account was NOT deleted
			return -1;
		}	
		
	}

	@GetMapping("/item/name/{name}")
	public Item getItemByName(@PathVariable String name) {
		try {
			return service.getItemByName(name);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@GetMapping("/items")
	public List<Item> getItems() {
		try {
			return service.getItems();
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@GetMapping("/items/{category}")
	public List<Item> getItemsByCategory(@PathVariable String category) {
		try {
			return service.getItemsByCategory(category);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@GetMapping("/items/price_range")
	public List<Item> getItemsByPriceRange(@RequestBody PriceRange priceRange) {
		try {
			return service.getItemsByPriceRange(priceRange);
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
