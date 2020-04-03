package com.AssignMentHw;

import java.util.ArrayList;
import java.util.Collections;

public class AssgQ7 {

	public static void main(String[] args) {
	
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(13);
		al.add(5);
		al.add(33);
		al.add(54);
		al.add(2);
		al.add(6);
	    al.add(31);
		al.add(133);
		al.add(9);
		al.add(10);
		
		
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<Integer> al1=al;
		System.out.println(al1);
		
		ArrayList<Integer> al2=new ArrayList <Integer>();
		al2.add(13);
		al2.add(5);
		al2.add(33);
		al2.add(54);
		al2.add(2);
		al2.add(6);
	    al2.add(31);
		al2.add(133);
		al2.add(9);
		al2.add(10);
		
		System.out.println(al.containsAll(al2));
		
		
		ArrayList<Integer> al4=new ArrayList<Integer>();
		
		
		
		
		
		
		

	}

}
