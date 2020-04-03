package com.SortingIdBasedOnCompareToMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		
		
		
		ArrayList<Emp> al1=new ArrayList<Emp>();
		ArrayList<Emp> al=null;
		Emp e=null;  
		al1.add(e);
	    System.out.println(al1.get(e.id));
		
		System.out.println(al.get(0));
		
		
		  al1.add(new Emp(12,""));
		  
		  Iterator itr=al1.iterator();
		  
		  while(itr.hasNext())
		   { 
		   Emp e1=(Emp)itr.next();
		  System.out.println(e1.name.length()); 
		  }
		 
		  
		  Integer i=null;
		  al1.add(new Emp(1,""));
		
		
	}
	

}
