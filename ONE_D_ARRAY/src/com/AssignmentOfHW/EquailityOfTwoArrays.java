package com.AssignmentOfHW;

import java.util.HashSet;

public class EquailityOfTwoArrays {

	public static void main(String[] args) {
		
		int arr1[] = {12, 22, 32, 42, 52,62};
		 
		int arr2[] = {52, 22, 62, 12, 42, 22};
		boolean flag=true;
		
		//System.out.println(arr1.length==arr2.length);
		/*
		for(int a1=0;a1<arr1.length;a1++)
		{   flag=true;
			for(int a2=0;a2<arr2.length;a2++)
			{
				if(arr1[a1]==arr2[a2])
				{
				 	flag=false;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Both arrays are equals");
		}
		else
		{
			System.out.println("Arrays are Not equals");
		}
		*/
		HashSet<Integer> set=new HashSet();
		for(int i:arr1) {
			set.add(i);
		}
		for(int i:arr1) {
			if(set.contains(i)) {
				set.remove(i);
			}
		}
		if(set.isEmpty()) {
			System.out.println("array Are equals");
		}
		else {
			System.out.println("Array Are Not equals");
		}

	}

}
