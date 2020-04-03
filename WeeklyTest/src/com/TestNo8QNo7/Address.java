package com.TestNo8QNo7;

public class Address {
    
	int zip;
	String city;
	public Address(int zip, String city) {
		this.zip = zip;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [zip=" + zip + ", city=" + city + "]";
	}
	
	
}
