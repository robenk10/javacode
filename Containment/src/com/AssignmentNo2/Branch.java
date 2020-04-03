package com.AssignmentNo2;

public class Branch {
  
	int id;
	String name;
	Subject s;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getS() {
		return s;
	}
	public void setS(Subject s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", s=" + s + "]";
	}
	
	
}
