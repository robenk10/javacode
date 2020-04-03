package com.LastOccurenceOfGivenWordString;

public class Demo {

	public static void main(String[] args) {
		
		String s="hello java programmer now python on the way";
		
		String []s1=s.split(" ");
		int count=0;
		
		for(int i=0;i<s1.length;i++)
		{    
			count++;
			if(i==s1.length-1)
			{
				System.out.println(s1[i]+"::"+"the Occurence Of Last Word ::"+count);
			}
		}

	}

}
