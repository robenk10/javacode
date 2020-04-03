package com.julybatch;

public class SecondMostchar {

	public static void main(String[] args) {
		
		String str="succeeesss";
		int size=256;
		int cnt[] =new int [size];
		
		for(int i=0;i<str.length();i++)
		{
			cnt[str.charAt(i)]++;
		}
		int firstmost=0;
		int secondmost=0;
		
		for(int i=0;i<size;i++)
		{
			if(cnt[i]>cnt[firstmost])
			{
			   secondmost=firstmost;
			   firstmost=i;
			}
	}
		System.out.println((char)secondmost);

	}

}
