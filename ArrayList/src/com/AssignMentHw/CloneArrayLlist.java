package com.AssignMentHw;

import java.util.ArrayList;

public class CloneArrayLlist {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList();
		al.add(1);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		
		
		ArrayList<Integer> al1=(ArrayList) al.clone();
		System.out.println(al1);
		
	}

}
