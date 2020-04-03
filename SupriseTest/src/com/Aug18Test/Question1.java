package com.Aug18Test;

public class Question1 {

	public static void main(String[] args) {
		
		//prime Number between 1 to 20
		int c=0;
		
	   for(int i=1;i<=20;i++)
	   {   
		   c=0;
		   for(int j=2;j<i;j++)
		   {
			   if(i%j==0)
			   {
				  c++; 
			   }
		   }
		   if(c==0)
		   {
			   System.out.println(i);
		   }
	   }

	}

}
