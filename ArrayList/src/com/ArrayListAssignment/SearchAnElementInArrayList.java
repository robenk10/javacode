package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class SearchAnElementInArrayList {
   
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList();
		al.add("green");
		al.add("red");
		al.add("yellow");
		al.add("how");
		al.add("green");
		al.add("red");
		al.add("yellow");
		
		
	for(int i=0;i<al.size();i++)
	{
		if(al.get(i).contains("green"))
		{
			System.out.println(al.get(i));
		}
	}
	    
	}
}
