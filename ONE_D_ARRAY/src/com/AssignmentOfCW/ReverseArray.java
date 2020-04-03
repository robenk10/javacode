package com.AssignmentOfCW;

public class ReverseArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		int arr[]=new int[a.length];
		int counter=0;
		
		
		for(int i=a.length-1;i>=0;i--)
		{
			arr[counter]=a[i];
			counter++;
		}
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
		
	}

}
