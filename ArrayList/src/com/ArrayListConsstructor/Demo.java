package com.ArrayListConsstructor;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	
	public ArrayList<String> al=new ArrayList();
	
	public ArrayList<String> al1=new ArrayList();
	public void m(String s)
	{
		
		
		al.add("green");
		al.add("red");
		al.add("yellow");
		al.add("how");
		al.add("green");
		al.add("red");
		al.add("yellow");
		al.add(s);
		System.out.println(al);
	}
	
	public void mmm(String s)
	{  
		
	
			al1.add(s);
		
		
		
	}

	public static void main(String[] args) {
		 
		
		Demo m=new Demo();
		
		
	   //	m.m(al);
		
	ArrayList<Integer> al1=new ArrayList <Integer> ();
		
		for(int i=0;i<50;i++)
		{
			al1.add(i+1);
		}
		
		
		Iterator itr=al1.iterator();	
		
		while(itr.hasNext())
		{
			if(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			itr.next();
		}
		

	}

}
