package com.AssignmentOfHW;

public class Negative_Zero_Number {

	public static void main(String[] args) {
	   
		

		int[] arr= {1,5,-3,-2,0,-6,0,5,1,-7,2};
		int temp;
		int count=0;
	
		for(int i=0;i<arr.length;i++)
		{
			/*
			 * for(int j=0;j<arr.length;j++) 
			 * { 
			 * if(arr[i]<arr[j]) 
			 * {
			 *  temp=arr[i];
			 * arr[i]=arr[j]; 
			 * arr[j]=temp; 
			 * }
			 * }
			 */
			if(arr[i]<0)
			{
				temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count++;
			}
		}
		for(int i=count;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}

	}

}
