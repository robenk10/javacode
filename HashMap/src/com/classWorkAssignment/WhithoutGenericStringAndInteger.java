package com.classWorkAssignment;

import java.util.HashMap;

public class WhithoutGenericStringAndInteger {
   
	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("c", 3);
		hm.put("d", 4);
		hm.put("e", 5);
		hm.put("a", 6);
		
	    Integer s=(Integer) hm.put("a", 6);
		System.out.println(s);
		
	 	System.out.println(hm);
		
		
	}
}
