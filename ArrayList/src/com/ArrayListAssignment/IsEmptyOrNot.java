package com.ArrayListAssignment;

import java.util.ArrayList;

public class IsEmptyOrNot {

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
			if(al.isEmpty())
			{
				System.out.println("ArrayList IS Emmptyy...");
			}
			else
			{    
			
				System.out.println("arrayList is full");
				break;
				
			}
		}

	}

}
