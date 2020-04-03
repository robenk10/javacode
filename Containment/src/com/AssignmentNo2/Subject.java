package com.AssignmentNo2;

public class Subject {
  
	int id;
	String name;
	Topic t;
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
	public Topic getT() {
		return t;
	}
	public void setT(Topic t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", t=" + t + "]";
	}
	
}
