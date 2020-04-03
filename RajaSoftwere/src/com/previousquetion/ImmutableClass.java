package com.previousquetion;


final class Immutable{
	private final String name;
	private final int id;
	public Immutable(String name,int id) {
		this.id=id;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}

public class ImmutableClass {

	public static void main(String[] args) {
	
		Immutable obj=new Immutable("RObin",101);
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		
	}

}
