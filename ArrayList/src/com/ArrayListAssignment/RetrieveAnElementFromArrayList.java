package com.ArrayListAssignment;

import java.util.ArrayList;

public class RetrieveAnElementFromArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList();
		al.add("green");
		al.add("red");
		al.add("yellow");
		al.add("green");
		al.add("yellow");
		al.add("green");
		
		System.out.println(al.get(2));
		
		al.set(0, "ANMOL");
		System.out.println(al.get(0));
		System.out.println(al);
		
		
		
		
		
		

	}

}
