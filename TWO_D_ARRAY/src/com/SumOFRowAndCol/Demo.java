package com.SumOFRowAndCol;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		  int [][] arr=new int [2][2];
			
		    int rowsum=0;
		    int colsum= 0;
		    int gttotal=0;
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
			System.out.println("Row Wise sum is");
			
			for(int row=0;row<arr.length;row++)
			{   
				rowsum=0;
				colsum=0;
				for(int col=0;col<arr.length;col++)
				{   
					System.out.print(arr[row][col]+" ");
					rowsum=rowsum+arr[row][col];
					colsum=colsum+arr[col][row];
					
				}
				System.out.print("|"+rowsum);
				gttotal=gttotal+rowsum;
				
				System.out.println();
			
			}
			System.out.println("===================");
				for(int col=0;col<arr.length;col++)
				{
					System.out.print(colsum+" ");
					
				}
				
				
				System.out.print(""+ gttotal);
				System.out.println();
			
			
            

	}

}
