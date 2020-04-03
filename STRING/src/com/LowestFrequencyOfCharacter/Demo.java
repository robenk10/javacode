package com.LowestFrequencyOfCharacter;

public class Demo {

	public static void main(String[] args) {


		String s="aajmkjaajbcjamajj";

		char [] ch=s.toCharArray();
		boolean flag=false;
	
		int count = 0;
		char ch1=' ';
		int i;
		int max=0;
		for( i=0;i<ch.length;i++)
		{   flag=false;
		count=1;

		for(int j=i-1;j>=0;j--)
		{
			if(ch[i]==ch[j])
			{
				flag=true;
			}

		}


		if(flag==false)
		{
			for(int k=i+1;k<ch.length;k++)
			{
				if(ch[i]==ch[k])
				{
					count++;
				}

			}

			if(count==1)
			{

				System.out.println(ch[i]+" "+count);
			}

		}

		}
	
	}

}
