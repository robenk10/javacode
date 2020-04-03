package com.septBatchPaper;

public class Student  implements Comparable <Student>{
    
	int sid;
	String name;
	String city;
	Float marks;
	
	public Student(int sid, String name, String city, Float marks) {
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
	 return o.name.compareTo(this.name);
	}
  
	
}
