package com.julybatch;

public class Item {
  
	int itemId;
	String itemName;
	int itemPrice;
	int itemQnty;
	
	
	public Item(int itemId, String itemName, int itemPrice, int itemQnty) {
	
		
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQnty = itemQnty;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemQnty="
				+ itemQnty + "]";
	}
	
	
	
}
