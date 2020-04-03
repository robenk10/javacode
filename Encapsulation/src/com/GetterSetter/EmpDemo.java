package com.GetterSetter;

public class EmpDemo {

	public static void main(String[] args) {
		
		Emp e=new Emp();
		e.setEmpId(1);
		e.setEmpName("amayla");
		e.setSal(10000);
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getSal());
		
	}

}
