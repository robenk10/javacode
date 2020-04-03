package com.previousquetion;

import java.util.Arrays;

public class SecondMinmumNumber {

	public static void main(String[] args) {
		
		 int[] a = {5,0,-1,-2,4,3,7,6};
		    int smallest = a[0];
		    int secondSmallest =0;
		    for (int i = 0; i < a.length; i++) 
		    {
	
		    	if(a[i]==smallest)
		        {
		          secondSmallest=smallest;
		         // smallest=a[i];
		        } 
		        else if (a[i]<smallest) 
		        {
		            secondSmallest = smallest;
		            smallest = a[i];
		        } 
		        else if (a[i] <secondSmallest) 
		        {
		            secondSmallest = a[i];
		        }

		    }
		    System.out.println("second ="+secondSmallest);
		    System.out.println("first  = "+ smallest);
	}

}
