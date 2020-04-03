package com.AssignmentOfCW;

import java.util.Arrays;

public class SortAnElementInascendingOrder {

	public static void main(String[] args) {
		
		int arr[] = {3, 90, 45, 29, 37, 78};
		
	    System.out.println("Before Ascending Order Element is "+"\n"+Arrays.toString(arr));
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		if(arr[i]>arr[j])
	    		{
	    			int temp=arr[i];
	    			 arr[i]=arr[j];
	    			 arr[j]=temp;
	    			 
	    		}
	    	}
	    }
	    System.out.println("After Sorting The Array ");
	  
		
	    System.out.println(Arrays.toString(arr));

	}

}
