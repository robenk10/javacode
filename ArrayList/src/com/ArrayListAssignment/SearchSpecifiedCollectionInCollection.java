package com.ArrayListAssignment;

import java.util.ArrayList;

public class SearchSpecifiedCollectionInCollection {

	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList();
		al.add("green");
		al.add("red");
		al.add("yellow");
		al.add("how");
	
		
		
		  ArrayList <Integer> al1=new ArrayList(); 
		  al1.add(2); 
		  al1.add(3); 
		  al1.add(4);
		  al1.add(5); 
		  al1.add(6);
		 
		
		
		ArrayList<String> al2=new ArrayList();
		al.add("green");
		al.add("red");
		al.add("yellow");
		al.add("how");
		
		
	        System.out.println(al.containsAll(al1));
	}

}