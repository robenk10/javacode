package com.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class PrintBelowKeyOnlyQ14 {

	public static void main(String[] args) {
		
		
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "Robin");
		hm.put(2, "ajay");
		hm.put(3, "namin");
		hm.put(5, "aRob");
		hm.put(6, "rjay");
		hm.put(7, "min");
		hm.put(8, "aan");
		hm.put(9, "in");
		
		
		
		int key=7;
		
		for(Map.Entry m:hm.entrySet())
		{
			
			  Integer i=(Integer) m.getKey(); 
			  int j=i;
			 
			if(j<key)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
		
		
		
		
		
		

	}

}
