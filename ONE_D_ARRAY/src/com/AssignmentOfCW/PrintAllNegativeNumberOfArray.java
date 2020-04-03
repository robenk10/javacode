package com.AssignmentOfCW;

public class PrintAllNegativeNumberOfArray {

	public static void main(String[] args) {
		
		int a[]= {-2,3,4,-5,-4,5,6,-7,5,-6};
		
        int count=0;
        
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]<0)
        	{  
        		count++;
        		System.out.print(a[i]+" ");
        		
        	}
        	System.out.println(count);
        }
	}

}
