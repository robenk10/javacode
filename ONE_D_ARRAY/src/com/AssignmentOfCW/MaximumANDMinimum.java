package com.AssignmentOfCW;

public class MaximumANDMinimum {

	public static void main(String[] args) {

		int arr[]= {7,4,9,5,3,6,7,8,5};

		int max=arr[0];
        int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max=arr[i];
			}
		
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("The maximum vlaue of Array is "+max);
		System.out.println("The minimum vlaue of Array is "+min);
		
	}

}


