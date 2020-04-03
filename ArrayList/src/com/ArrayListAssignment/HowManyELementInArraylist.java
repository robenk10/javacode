package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class HowManyELementInArraylist {

	public static void main(String[] args) {
		
		
		int counter=0;
		

		ArrayList<String> al=new ArrayList();
		al.add("green");
		al.add("red");
		al.add("yellow");
		al.add("how");
		al.add("green");
		al.add("red");
		al.add("yellow");
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			String s=(String) itr.next();
			counter++;
			
			
		}
		
		System.out.println(counter);
		
		Collections.swap(al, 2,4);
		System.out.println(al);

	}

}
