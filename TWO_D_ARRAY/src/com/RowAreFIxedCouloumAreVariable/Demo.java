package com.RowAreFIxedCouloumAreVariable;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int n=3;
		int n1=3;
		int [][] arr=new int [n][n1];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Element in array");
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n1;col++)
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

	}

}
