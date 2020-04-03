package com.createEmployeeObject;

public class Employee  implements Comparable <Employee>{
    
	int id;
	String name;
	String Designation;
	int age;
	
	
	public Employee(int id,String name, String designation, int age) {
		
		this.id=id;
		this.name = name;
		Designation = designation;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", Designation=" + Designation + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Employee e) {
		
		return this.id-e.id;
	}
	
	
	
	
}
