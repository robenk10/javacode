package com.ParameterisedConstructor;

public class Address {
  
	public String city;
    public 	int zip;
	public Address(String city, int zip) {
		
		this.city = city;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", zip=" + zip + "]";
	}
	
	
	
	
}
