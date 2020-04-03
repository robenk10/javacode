package com.OccurenceOfCharacter;

public class CountOccurence {

	public static void main(String[] args) {
		
		String str="amitKudal";
		char c='a';
		//char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				count++;
			}

		}
		System.out.println("The  ocurrence " + count + " Of a");

	}

}
