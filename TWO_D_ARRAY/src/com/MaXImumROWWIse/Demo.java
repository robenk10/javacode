package com.MaXImumROWWIse;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

	    int [][] arr=new int [3][3];
		
	    int max=0;
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
		System.out.println("maximum Row Wise Element");
		for(int row=0;row<arr.length;row++)
		{   
			max=arr[row][0];
			for(int col=0;col<arr[row].length;col++)
			{
				if(max<arr[row][col])
				{
					max=arr[row][col];
				}
			}
			System.out.println(max);
		}

	}

}
