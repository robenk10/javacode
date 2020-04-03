package com.AddSomeColorTOarrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AddSomeColorTOarrayList {
   
	public static void main(String[] args) {
		
		ArrayList<String >al=new ArrayList<String>();
		
		al.add("Red");
		al.add("blue");
		al.add("green");
		al.add("yellow");
		al.add("green");
		al.add("orange");
		
		
		ArrayList<String >al1=new ArrayList<String>();
		al1.add("red");
		
		
	
		
		
		Iterator itr= al.iterator();

		while(itr.hasNext())
		{   
			
			System.out.println("::"+itr.next() );
			
		}
		

		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println();
		
		
		al.remove("red");
	
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println();
		
		al.removeAll(al);
		System.out.println("After removing::");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		
		
		
		
		
		
		
	}
}
