package com.Aug18Test;

public class Question3 {

	public static void main(String[] args) {
		// sum of digit

		int n = 123;
		int d, sum = 0;
		while (n != 0) {
			d = n % 10;
			sum = sum + d;
			n = n / 10;

		}
		System.out.println(sum);
		
		
		
		//sum of 1st digit and last digit
		
		int n1=123;
		int d1,sum1=0,r = 0;
		
		d=n1%10;
		while(n1!=0)
		{
			r=n1%10;
			n1=n1/10;
		}
		sum=d+r;
		System.out.println(sum);
		
	}

}
