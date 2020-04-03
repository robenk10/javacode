package com.TestNo6;

public class Q11 {

	public static void main(String[] args) {
		
		String s="a5i9gfj4abc";
		
		char [] ch=s.toCharArray();
		int sum=0;
		int avg;
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='1' && ch[i]<='9')
			{    String s1="";
			 //  System.out.println(ch[i]);
				s1=s1+ch[i];
				int n=Integer.parseInt(s1);
				//System.out.println(n);
				sum=sum+n;
				count++;
			}
			
		}
		/*
		 * System.out.println(sum); System.out.println(count);
		 */
		avg=sum/count;
		System.out.println(avg);
	}

}
