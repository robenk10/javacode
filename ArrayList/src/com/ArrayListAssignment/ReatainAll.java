package com.ArrayListAssignment;

import java.util.ArrayList;

public class ReatainAll {

	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList();
		al.add("green");
		al.add("red");
		al.add("yellow");
		
		
		ArrayList<String> al1=new ArrayList();
		al1.add("green");
		al1.add("yellow");
		al1.add("green");
		
		al1.remove("green");
		System.out.println(al1);
		
		al1.retainAll(al);
		//System.out.println(al1);

	}

}
