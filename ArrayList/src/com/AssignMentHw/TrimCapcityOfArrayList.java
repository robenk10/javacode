package com.AssignMentHw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;




public class TrimCapcityOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList(100);
		al.add(1);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		
		al.ensureCapacity(100);
		System.out.println(al.size());
		
		al.trimToSize();
		System.out.println(al.size());
		
		al.remove(2);
		System.out.println(al);
		
		 //SHuffle ArrayList 
		Collections.shuffle(al);
		System.out.println(al);
		
		
		//reverse An ARRayList...
		
		for(int i=al.size()-1;i>=0;i--)
		{
			//System.out.println(al.get(i));
		}
		
	    Collections.reverse(al);
	    System.out.println(al);
		

	}

}
