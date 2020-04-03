package com.TechnicalInterviewQ;

import java.util.HashSet;

public class SingleNumber {
	
	
	public static void inNumber(int [] nums)
	{
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i:nums)
		{
			if(set.contains(i)){
				set.remove(i);
			}
			else {
				set.add(i);
			}
		}
		
		  System.out.println(set);
	 }

	public static void main(String[] args) {
		
		
		int [] arr= {2,2,1,4,31,1,3,3,4,34};
		inNumber(arr);

	}

}
