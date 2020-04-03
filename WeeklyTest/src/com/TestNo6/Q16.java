package com.TestNo6;

public class Q16 {

	public static void main(String[] args) {
		
		String s="India is my country";
		String s1=s.toLowerCase();
		String s2=s1.replace('i', '@');
		//System.out.println(s2);
		
		String [] s3=s2.split(" ");
		
		for(int i=0;i<s3.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s3[j]);
			}
			
			System.out.println();
		}
		

	}

}
