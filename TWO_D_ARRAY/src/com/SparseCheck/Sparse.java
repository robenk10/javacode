package com.SparseCheck;

import java.util.Scanner;

public class Sparse {

	public static void main(String[] args) {
	
		int [][] arr=new int [4][4];
		int count=0;
		int c=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Element in array");
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				arr[row][col]=sc.nextInt();
			}
		}
		for(int [] x:arr)
		{
			for(int a:x)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
		//System.out.println("minimum Row Wise Element");
		for(int row=0;row<arr.length;row++)
		{   

			for(int col=0;col<arr[row].length;col++)
			{
				if(arr[row][col]==0)
				{
					count++;
				}
				else
				{
					c++;
				}
				

			}
			System.out.println();

		}
		
		if(count>c)
		{
			System.out.println("matrix is sparse");
		}
		else
		{
			System.out.println("matrix is not sparse");
		}
		
	  


	}

}
