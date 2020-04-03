package com.TestTwo;

public class Question15 {

	public static void main(String[] args) {
		int r,fact=1;
		int sum=0;
		for(int i=1;i<=5;i++)
		{    fact=1;
		     int j=i;
			while(j>0)
			{
				
				fact=fact*j;
				j--;
				
			}
			sum=sum+fact;
			System.out.println(sum);
			
		}

	}

}
