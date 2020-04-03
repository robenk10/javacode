package com.AssignmentOfCW;

public class IteratingArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		int arr[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			arr[i]=a[i];
			
		}
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}

	}

}
