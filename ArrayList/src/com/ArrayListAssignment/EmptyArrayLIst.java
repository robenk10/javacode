package com.ArrayListAssignment;

import java.util.ArrayList;

public class EmptyArrayLIst {

	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList();
		al.add("green");
		al.add("red");
		al.add("yellow");
		al.add("how");
		al.add("green");
		al.add("red");
		al.add("yellow");
		
		
		//al.removeAll(al);
		al.clear(); 
	    for( String e:al)
	    {   
	    	if(e.isEmpty()) {
	    		System.out.println("is empty");
	    	}
	    	
	    	//System.out.println(e);
	    	
	    }
	}

}
