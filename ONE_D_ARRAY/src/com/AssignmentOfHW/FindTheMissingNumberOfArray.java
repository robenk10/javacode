package com.AssignmentOfHW;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMissingNumberOfArray { 
	

	public static void main(String[] args) {


		System.out.println("Enter the number::");
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();	

		int size=n;
		int [] a=new int[size];

		System.out.println("Enter the array between 1 to number");
		for(int i=0;i<n;i++)
		{ 
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

		FindTheMissingNumberOfArray obj=new FindTheMissingNumberOfArray();

		int count=1;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{   flag=0;
		//System.out.println(count);
		if(a[i]==count+i)
		{
			
		 continue;
		}
		else
		{   flag=count+i;
		     if(flag<a[i])
		     {
		    	 count++;
		    	 
		     }
			System.out.println(flag);

		}
		


		//System.out.println(Arrays.toString(a));



		}
	}

}
