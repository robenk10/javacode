package com.FlipkartQ;

public class Order {
   
	int Orderid;
	String city;
	String itemName;
	String Status;
	
	
	public Order(int orderid, String city, String itemName, String status) {
		Orderid = orderid;
		this.city = city;
		this.itemName = itemName;
		this.Status = status;
	}
	
	
	
}
