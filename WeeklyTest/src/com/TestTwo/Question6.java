package com.TestTwo;

public class Question6 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("  ");
			}
			
			
			for( k=k-i;k<=i;k++)
			{
				System.out.print(i+"  ");
			}
			System.out.println();
		}

	}

}
