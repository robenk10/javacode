package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Print1to50EvenNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList <Integer> ();
		
		for(int i=0;i<50;i++)
		{
			al.add(i+1);
		}
		
		
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			itr.next();
			if(itr.hasNext())
			{
			System.out.println(itr.next());
			}
	
		}
	}

}
