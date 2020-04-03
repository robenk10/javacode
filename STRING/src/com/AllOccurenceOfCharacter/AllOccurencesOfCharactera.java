package com.AllOccurenceOfCharacter;

public class AllOccurencesOfCharactera {

	public static void main(String[] args) {


		String s="PPPPaaabccdeeffppp";
		String s1=s.toUpperCase();
		int size=26;

		char [] count=new char[size];

		for(int i=0;i<s.length();i++)
		{
			for(char j='A';j<='Z';j++)
			{


				if(s.charAt(i)==j)
				{

					count[s.charAt(i)]++;
				}

			}
		}


		for(int i=0;i<size;i++)
		{
			if(count[i]>0)
			{    

				System.out.println("::"+count[i]);

			}
		}
	}

}
