package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Item;
import com.app.model.PriceRange;
import com.app.repository.ItemRepository;
import com.app.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemRepository repo;

	@Override
	public Item createItem(Item item) {
		return repo.save(item);
	}

	@Override
	public Item updateItem(Item item) {
		return repo.save(item);
	}

	@Override
	public Item getItem(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void deleteItem(int id) {
		repo.deleteById(id);
	}

	@Override
	public Item getItemByName(String name) {
		return repo.getItemByName(name);
	}

	@Override
	public List<Item> getItems() {
		return repo.findAll();
	}

	@Override
	public List<Item> getItemsByCategory(String category) {
		return repo.findByCategory(category);
	}

	@Override
	public List<Item> getItemsByPriceRange(PriceRange priceRange) {
		return repo.getItemsByPriceRange(priceRange.getPriceMin(), priceRange.getPriceMax());
	}

	

}
