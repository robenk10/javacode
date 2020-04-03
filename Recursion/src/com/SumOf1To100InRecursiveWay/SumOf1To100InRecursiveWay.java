package com.SumOf1To100InRecursiveWay;

public class SumOf1To100InRecursiveWay {
	
	
	public int sum(int n)
	{  
		if(n==0)
		{
			return 0;
		}
		else {
		return n+sum((n-1));
		}
	}

	public static void main(String[] args) {
		
		SumOf1To100InRecursiveWay s=new SumOf1To100InRecursiveWay();
		System.out.println(s.sum(100));
	}

}
