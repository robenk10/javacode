package com.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Class {
    
	public static void main(String[] args) {
		
		
		ArrayList<String> a=new ArrayList ();
        
		  a.add("Green");
		  a.add("blue");
		  a.add("yellow");
		  a.add(null);
		  a.add(2, "pink");
		  
		  System.out.println(a);
		  
		  ArrayList<String> a1= (ArrayList) a.clone();  ///shallow cloning is applied in here
		  System.out.println(a1);
		  
		  a.addAll(a1);
		  System.out.println(a);
		  
		  a.clear();
		  System.out.println(a);
		  
		  a.addAll(a1);
		  System.out.println(a);
		  
		  
		System.out.println(a.contains(a1));  
		System.out.println(a1);
		a.spliterator();
		System.out.println(a);
	}
}
