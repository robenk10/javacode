package com.TransposeTheMartixROWitnoCOL;

import java.util.Scanner;

public class RowIntCol {

	public static void main(String[] args) {
		
		
		int [][] arr=new int [3][3];
		int count=0;
		int c=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Element in array::");
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				arr[row][col]=sc.nextInt();
			}
		}
		System.out.println("The Matrix from is::");
		for(int [] x:arr)
		{
			for(int a:x)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("Rotate Colum into row::");
		for(int col=arr.length-1;col>=0;col--)
		{   

			for(int row=0;row<arr.length;row++)
			{
				 
               System.out.print(arr[row][col]+" ");
			}
			System.out.println();

		}
	}

}
