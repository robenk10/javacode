package com.AssignmentOfHW;

import java.util.Arrays;
import java.util.Scanner;

public class StackmplementationArray { 
	
	public int[] Push(int[] a)
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		return a;
	}
	
	public int[] pop(int [] a)
	{   
		

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[a.length-1])
			{
				a[i]=0;
				
			}
			
		}
		return a;
	}
	
	public int[] display(int[] a)
	{  
		
		return a;
	}
    
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array size to create array");
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		
		StackmplementationArray obj=new StackmplementationArray ();
		
        int[] push=obj.Push(arr);
        System.out.println("Push Element is:: \n"+Arrays.toString(push));
        
        int [] pop=obj.pop(push);
   
        
        int[] disp=obj.display(pop);
        System.out.println("display the array::\n"+Arrays.toString(disp));
		

	}

}
