package com.FlipkartQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Demo {

	public static void main(String[] args) {
	
		ArrayList<Order> al=new ArrayList();
		
		HashMap<String ,Integer> hmap=new HashMap();
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("details of Adding element");
		for(int i=1;i<6;i++)
		{ 
			
			int id=sc.nextInt();
			String city=sc.next();
			String itemName=sc.next();
			String status=sc.next();
			
			al.add(new Order(id,city,itemName,status));
		}
		
		int count=0;
		for(int i=0;i<al.size();i++)
		{   
			if(al.get(i).Status.equalsIgnoreCase("pending"))
			{   
			     count =1;
				if(hmap.containsKey(al.get(i).city)==false)
				{
					hmap.put(al.get(i).city, count);
				}
				else
				{
				
					count++;
					hmap.put(al.get(i).city, count);
				}
			}
		}
		
		TreeMap<String ,Integer > tmap=new TreeMap(hmap);
		
		for(Map.Entry<String , Integer> s:tmap.entrySet())
		{
			System.out.println(s.getKey()+" pending order is="+s.getValue());
		}
		
		
	}

}
