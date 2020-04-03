package com.GetterSetterMethod;

public class Emp {

	int id;
	String name;
	Dept d;

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

	public static void main(String[] args) {
		
		Emp e=new Emp();
		e.setId(19);
		e.setName("amit");
		e.setD(new Dept());
		e.d.setDid(1111);
		e.d.setDname("sales");
		
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.d.getDid());
		System.out.println(e.d.getDname());

	}

}
