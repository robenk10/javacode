package com.SortingIdBasedOnCompareToMethod;

public class Emp implements Comparable <Emp>{
    
	Integer id;
	String name;
	 
	
	



	public Emp(Integer id, String name) {
		
		this.id = id;
		this.name = name;
	}



	@Override
	public int compareTo(Emp e) {
		
		return this.id.compareTo(e.id);
	}



	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
