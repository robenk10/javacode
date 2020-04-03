package com.AssignmentOfCW;

import java.util.Scanner;

public class AverageValueOfArray {
    
	public void avg(int a[])
	{   
		int sum = 0;
		int l=a.length;
		for(int row=0;row<a.length;row++)
		{
			sum=sum+a[row];
		}
		System.out.println("Average Of array is "+ (float)sum/l);
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the array size::");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int arr[] =new int[size];
		System.out.println("Enter the Array Element");
		for(int row=0;row<arr.length;row++)
		{ 
		  arr[row]=sc.nextInt();
			
		}
		
		AverageValueOfArray obj=new AverageValueOfArray();
		
		obj.avg(arr);
		
	}

}
