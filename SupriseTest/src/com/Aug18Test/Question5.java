package com.Aug18Test;

public class Question5 {

	public static void main(String[] args) {
		
		//series 1 2 9 4 25 
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				System.out.println(i*i);
			}
		}
		
		
		int j=1;
		int count=0;
		while(j<=10)
		{
			System.out.println((int)Math.pow(j, count));
			if(count==2)
			{
				count=1;
				j++;
			}
			else {
			j++;
			count++;
			}
		}

	}

}
