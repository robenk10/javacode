package com.TechnicalInterviewQ;

import java.util.HashSet;

public class ContainDuplicateInArray {
	
	public static boolean isContain(int [] nums)
	{
		HashSet<Integer> set= new HashSet<Integer> ();
		for(int i:nums)
		{ 
			
			if(set.contains(i))
			{ 
				return true;
				
			}
			else {
				set.add(i);
			}
		}
		
		
		return false;
		
	}

	public static void main(String[] args) {
		
        int [] arr= {1,2,3,4 ,1,2,1,3};
        System.out.println(isContain(arr));
	}

}
