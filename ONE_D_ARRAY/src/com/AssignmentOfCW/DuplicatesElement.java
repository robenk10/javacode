package com.AssignmentOfCW;

public class DuplicatesElement {
	
	
	public static void main(String[] args) {
		int[] arr= {10,9,10,12,12,14,15,9};

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicates_Element in array :: " +arr[i]);
				}
			}


		}
	}

}


