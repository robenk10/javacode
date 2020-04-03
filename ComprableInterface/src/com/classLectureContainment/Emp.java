package com.classLectureContainment;


public class Emp implements Comparable <Emp>

{

	int id;
	String name;
	Dept d;





	Emp(int id, String name, Dept d) {

		this.id = id;
		this.name = name;
		this.d = d;
	}





	@Override
	public int compareTo(Emp e) {

		if(this.id==e.id) {
			return this.name.compareTo(e.name);
			
		}
		else if(this.id>e.id){
			return 1;
		}
		else {
			return -1;
		}
	}





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





	public Dept getD() {
		return d;
	}





	public void setD(Dept d) {
		this.d = d;
	}





	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", d=" + d + "]";
	}






}
