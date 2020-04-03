package com.june2018;

import java.util.Arrays;

public class Example9 {

	public static void main(String[] args) {
		
		char ch[ ]= {'Z','R','G','B'};
		
	for(int i=0;i<ch.length-2;i++)
	{

			if(ch[i] > ch[i+1])
			{
				
				char temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
			}
		}

	
	for(char c:ch)
	{
		System.out.print(c);
	}

	}

}
