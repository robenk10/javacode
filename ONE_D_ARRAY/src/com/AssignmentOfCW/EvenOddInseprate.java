package com.AssignmentOfCW;

import java.util.*;

public class EvenOddInseprate {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		//int even[]=new int[arr.length];
		//int odd[]=new int[arr.length];
		//int j=0;
		//int m=0;
		List<Integer> even=new ArrayList();
		List<Integer> odd=new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			//	even[m]=arr[i];
			//	m++;
				even.add(arr[i]);
				
			}
			else
			{
			
			//	odd[j]=arr[i];
			//	j++;
			  odd.add(arr[i]);
			}
		}
		
		/*for(int i=0;i<m;i++)
		{
			if(m>1)
			{
				System.out.print(even[i]+" ");
			}
		}
		System.out.println();
		
		for(int i=0;i<j;i++)
		{
			if(j>1)
			{
				System.out.print(odd[i]+" ");
			}
		}*/
		System.out.println(even);
		System.out.println(odd);
		
		
	}

}
