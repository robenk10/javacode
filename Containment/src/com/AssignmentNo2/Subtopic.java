package com.AssignmentNo2;

public class Subtopic {
   
	int id;
	String name;
	Question q;
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
	public Question getQ() {
		return q;
	}
	public void setQ(Question q) {
		this.q = q;
	}
	@Override
	public String toString() {
		return "Subtopic [id=" + id + ", name=" + name + ", q=" + q + "]";
	}
	
	
}
