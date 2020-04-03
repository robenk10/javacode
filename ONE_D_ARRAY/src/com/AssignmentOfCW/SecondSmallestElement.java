package com.AssignmentOfCW;

import java.util.Arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {
		
		
		int arr[]= {7,4,9,5,3,6,7,8,5};

		int max=arr[0];
        int min=arr[0];
        System.out.println("Array");
        System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(max>arr[i])
			{
				max=arr[i];
			}
		
		}
		
		
		System.out.println("The Secondsmallest vlaue of Array is "+max);
	}

}
