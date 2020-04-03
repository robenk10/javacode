package com.AssignmentOfCW;

public class SearchSpecificPositionOfArray {

	public static void main(String[] args) {
		
		int a[] =new int[5];
		for(int i=0;i<a.length;i++)
		{
			if(i==3)
			{
				a[i]=10;
				
			}
		}
		
		for(int x:a)
		{
			System.out.print(x+" ");
		}

	}

}
