package com.OuterElementOfArray;

import java.util.Scanner;

public class PrintOuter {

	public static void main(String[] args) {


		int [][] arr=new int [4][4];
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
		//System.out.println("minimum Row Wise Element");
		for(int row=0;row<arr.length;row++)
		{   

			for(int col=0;col<arr[row].length;col++)
			{
				if(row==0||col==0||row==arr.length-1||col==arr.length-1)
				{
					System.out.print(arr[row][col]+" ");
				}
				else
				{
					System.out.print("  ");
				}

			}
			System.out.println();

		}

	}

}
