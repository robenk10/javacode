package com.julybatch;

import java.util.*;

public class ItemDemo {

	public static void main(String[] args) {

		List<Item> alist=new ArrayList<Item>();
		Scanner sc=new Scanner(System.in);
		Map<String ,Integer> hmap=new HashMap<String, Integer>();
		int count=0;
		System.out.println("Enter the details");
		for(int i=0;i<10;i	++)
		{
			alist.add(new Item(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt()));
		}

	/*	for(Item m:alist)
		{
			if(hmap.containsKey(m.itemName)==false)
			{
				hmap.put(m.itemName, m.itemQnty);
			}
			else
			{
				int oldval=hmap.get(m.itemName);
				int newval= m.itemQnty+oldval;
				hmap.put(m.itemName, newval);
			}
*/		
		
		for(Item m:alist)
		{
			if(hmap.containsKey(m.itemName))
			{
				count=hmap.get(m.itemName);
			}
			else
			{
				count=0;
			}
			count=count+m.itemQnty;
			hmap.put(m.itemName, count);
		}


		for(Map.Entry<String , Integer> m:hmap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
