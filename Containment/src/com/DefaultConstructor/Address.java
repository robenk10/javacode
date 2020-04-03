package com.DefaultConstructor;

public class Address {
 public  String city;
 public  int zip;
   
  public Address()
  {
	  city="pune";
	  zip=41;
  }

@Override
public String toString() {
	return "Address [city=" + city + ", zip=" + zip + "]";
}
}
