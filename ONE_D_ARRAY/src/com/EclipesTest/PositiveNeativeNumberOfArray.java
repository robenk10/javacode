package com.EclipesTest;

import java.util.Arrays;

public class PositiveNeativeNumberOfArray {
   
	public static void main(String[] args) {
		
		int arr[] = {1,-1,3,-2,4,-3,-4};
		

	   for(int i=0;i<arr.length;i++)
	   {    if(arr[i]<0){    
			    for(int j=0;j<arr.length;j++)
			    {  
			    	if(arr[j]<0) {
			            if(arr[i]<arr[j]) {  
				           int temp=arr[j];
			               arr[j]=arr[i];
			               arr[i]=temp;
			         }
			       }
			    }
		    }
	   }
	   
	   System.out.println(Arrays.toString(arr));
	}
}
