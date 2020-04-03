package com.FindPowerOfNumber;

public class FindPowerOfNumber {
	
	public static int pow(int p,int i)
	{
		if(i==0)
		{
			return 1;
			
		}
		
		else
		{
			return p*pow(p,i-1);
		}
	}

	public static void main(String[] args) {
		
		
     System.out.println(pow(2,3));  
	}

}
