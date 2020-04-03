package com.AssignmentOfCW;

import java.util.Arrays;

public class ReverseArrayWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		
		int[] arr= {3, 90, 45, 29, 37, 78};
		
		
		System.out.println("Before Reverse \n"+Arrays.toString(arr));
		
		
		int l=arr.length/2;
		int m=arr.length-1;
		for(int i=0;i<l;i++)
		{  
		   arr[i]=arr[i]+arr[m-i];
		   arr[m-i]=arr[i]-arr[m-i];
		   arr[i]=arr[i]-arr[m-i];
			 
		}
		System.out.println("Afer Reversing \n"+Arrays.toString(arr));
		
	}

}
