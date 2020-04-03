package com.WriitenExamOfAgustBatch;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Question8 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		List <Integer > llist=new LinkedList<Integer>();
		Map<String ,Integer> hmap=new HashMap<String, Integer>();

		System.out.println("enter the number in list");
		for(int n=0;n<10;n++)
		{ 
			int m=sc.nextInt();
			llist.add(m);
		}
		int count=0;
		boolean flag=false;   
		for(int i=0;i<llist.size();i++)
		{  
			count=1;
			flag=false;
			for(int j=i-1;j>=0;j--)
			{
				if(llist.get(i)==llist.get(j))
				{
					flag=true;
				}
			}

			if(flag==false)
			{
				for(int k=i+1;k<llist.size();k++)
				{
					if(llist.get(i)==llist.get(k))
					{
						count++;
					}
				}
					switch(llist.get(i))
					{
					case 1: hmap.put("One", count);
					break;
					case 2:hmap.put("two", count);
					break;
					case 3:hmap.put("three", count);
					break;
					case 4:hmap.put("four", count);
					break;
					case 5:hmap.put("five", count);
					break;
					}
				
			}
		}

			for(Map.Entry<String , Integer> h:hmap.entrySet())
			{
				System.out.println(h.getKey()+" "+h.getValue());
			}

		
	}

}
