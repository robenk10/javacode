package com.pack1;

import java.util.*;

public class UsingFreq {


	public static void main(String[] args) {
	
		
		ArrayList<String> al=new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("one");
		al.add("one");
		
		Set<String> hset=new HashSet(al);
		for(String s:hset)
		{
		
		System.out.println(s+" "+Collections.frequency(al, s));
		}
		
		
		
		
		
		
		

	}

}