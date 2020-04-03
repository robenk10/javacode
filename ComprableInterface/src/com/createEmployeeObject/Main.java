package com.createEmployeeObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList();
		
		al.add(new Employee(11,"amitJi","programmer",89));
		al.add(new Employee(22,"Mitwa","programmerCoder",40));
		al.add(new Employee(3,"harsha","Rooobin",50));
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}

}
