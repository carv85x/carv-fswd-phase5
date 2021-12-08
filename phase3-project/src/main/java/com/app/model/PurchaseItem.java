package com.app.model;

import javax.persistence.Embeddable;

@Embeddable
public class PurchaseItem {
	
	private int itemId;	
	private int qty;	
		
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "PurchaseItem [itemId=" + itemId + ", qty=" + qty + "]";
	}	
	
}
