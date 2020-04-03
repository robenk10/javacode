package com.AssignmentNo2;

public class Topic {
     
	int id;
	String name;
	Subtopic sb;
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
	public Subtopic getSb() {
		return sb;
	}
	public void setSb(Subtopic sb) {
		this.sb = sb;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", sb=" + sb + "]";
	}
	
}
