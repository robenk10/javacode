package com.TestNo3;

public class QuestionNo8 {

	public static void main(String[] args) { 
		 int c=3;
		for(int i=1;i<=4;i++)
		{  
			
			for(int j=4;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			
			 
			
			for(int m=2;m<=i;m++)
			{   
				
				System.out.print(c+" ");
				c++;
				
			}
			if(c==6)
			{
				c--;
			}
			
			System.out.println();
		}

	}

}
