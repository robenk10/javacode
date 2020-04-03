package com.MinimumIncoloum;

import java.util.Scanner;

public class MinimumIncoloum {

	public static void main(String[] args) {

		int [][] arr=new int [3][3];

		int min=0;
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
		System.out.println("minimum Row Wise Element");
		for(int row=0;row<arr.length;row++)
		{   
			min=arr[row][0];
			for(int col=0;col<arr[row].length;col++)
			{
				if(min>arr[row][col])
				{
					min=arr[row][col];
				}
			}
			System.out.println(min);




		}
	}
}